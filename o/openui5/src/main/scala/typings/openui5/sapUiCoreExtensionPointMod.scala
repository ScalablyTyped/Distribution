package typings.openui5

import org.scalablytyped.runtime.Shortcut
import typings.openui5.anon.Container
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreExtensionPointMod extends Shortcut {
  
  @JSImport("sap/ui/core/ExtensionPoint", JSImport.Default)
  @js.native
  val default: ExtensionPoint = js.native
  
  trait ExtensionPoint extends StObject {
    
    /**
      * @SINCE 1.56.0
      *
      * Creates 0..n UI5 controls from an `ExtensionPoint`.
      *
      * One control if the `ExtensionPoint` is e.g. filled with a `View`, zero for extension points without configured
      * extension and n controls for multi-root `Fragments` as extension.
      *
      * @returns a Promise, which resolves with an array of 0..n controls created from an `ExtensionPoint`. If
      * `mOptions.createDefaultContent` is called and returns a Promise, that Promise is returned by `ExtensionPoint.load`.
      */
    def load(/**
      * an object map (see below)
      */
    mOptions: Container): js.Promise[js.Array[typings.openui5.sapUiCoreControlMod.default]]
  }
  object ExtensionPoint {
    
    inline def apply(load: Container => js.Promise[js.Array[typings.openui5.sapUiCoreControlMod.default]]): ExtensionPoint = {
      val __obj = js.Dynamic.literal(load = js.Any.fromFunction1(load))
      __obj.asInstanceOf[ExtensionPoint]
    }
    
    extension [Self <: ExtensionPoint](x: Self) {
      
      inline def setLoad(value: Container => js.Promise[js.Array[typings.openui5.sapUiCoreControlMod.default]]): Self = StObject.set(x, "load", js.Any.fromFunction1(value))
    }
  }
  
  type _To = ExtensionPoint
  
  /* This means you don't have to write `default`, but can instead just say `sapUiCoreExtensionPointMod.foo` */
  override def _to: ExtensionPoint = default
}
