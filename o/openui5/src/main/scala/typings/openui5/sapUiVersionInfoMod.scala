package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Library
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiVersionInfoMod extends Shortcut {
  
  @JSImport("sap/ui/VersionInfo", JSImport.Default)
  @js.native
  val default: VersionInfo = js.native
  
  /**
    * @SINCE 1.56.0
    */
  @js.native
  trait VersionInfo extends StObject {
    
    /**
      * @SINCE 1.56.0
      *
      * Loads the version info asynchronously from resource "sap-ui-version.json".
      *
      * By default, the returned promise will resolve with the whole version info file's content. If a library
      * name is specified in the options, then the promise will resolve with the version info for that library
      * only or with `undefined`, if the named library is not listed in the version info file.
      *
      * If loading the version info file fails, the promise will be rejected with the corresponding error.
      *
      * @returns A promise which resolves with the full version info or with the library specific version info
      * or `undefined` if the library is not listed; if an error occurred during loading, then the promise is
      * rejected.
      */
    def load(): js.Promise[js.UndefOr[js.Object]] = js.native
    def load(/**
      * Map of options
      */
    mOptions: Library): js.Promise[js.UndefOr[js.Object]] = js.native
  }
  
  type _To = VersionInfo
  
  /* This means you don't have to write `default`, but can instead just say `sapUiVersionInfoMod.foo` */
  override def _to: VersionInfo = default
}
