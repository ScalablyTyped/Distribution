package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapFIllustrationPoolMod extends Shortcut {
  
  @JSImport("sap/f/IllustrationPool", JSImport.Default)
  @js.native
  val default: IllustrationPool = js.native
  
  /**
    * @SINCE 1.88
    * @deprecated (since 1.98) - Use the {@link sap.m.IllustrationPool} instead.
    *
    * `IllustrationPool` loads the illustration assets (SVGs) via XMLHttpRequest requests.
    *
    * The successfully loaded data is kept in the DOM (div with ID `sap-illustration-pool`) in the `sap-ui-static`
    * DOM element.
    *
    * To load a given asset, register its illustration set through the {@link sap.m.IllustrationPool#sap.m.IllustrationPool.registerIllustrationSet
    * registerIllustrationSet} API of `IllustrationPool`. The exception being the `sapIllus`, which is the
    * default illustration set that is registered by default.
    *
    * The default behavior of `IllustrationPool` is to load/require an asset only when it's needed by using
    * the {@link sap.m.IllustrationPool#sap.m.IllustrationPool.loadAsset loadAsset} API. When registering the
    * new illustration set, you are given the option to load all of its assets.
    *
    * If some of the assets are not loaded initially, you can load the rest of them on a later state with the
    * {@link sap.m.IllustrationPool#sap.m.IllustrationPool.loadRestOfTheAssets loadRestOfTheAssets} API.
    */
  trait IllustrationPool extends StObject
  
  type _To = IllustrationPool
  
  /* This means you don't have to write `default`, but can instead just say `sapFIllustrationPoolMod.foo` */
  override def _to: IllustrationPool = default
}
