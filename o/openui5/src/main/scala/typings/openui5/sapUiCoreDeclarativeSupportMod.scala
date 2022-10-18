package typings.openui5

import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiCoreDeclarativeSupportMod {
  
  @JSImport("sap/ui/core/DeclarativeSupport", JSImport.Default)
  @js.native
  open class default ()
    extends StObject
       with DeclarativeSupport
  /* static members */
  object default {
    
    @JSImport("sap/ui/core/DeclarativeSupport", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Enhances the given DOM element by parsing the Control and Elements info and creating the SAPUI5 controls
      * for them.
      */
    inline def compile(/**
      * the DOM element to compile
      */
    oElement: Element): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("compile")(oElement.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def compile(
      /**
      * the DOM element to compile
      */
    oElement: Element,
      /**
      * The view instance to use
      */
    oView: Unit,
      /**
      * Whether the call of the function is recursive.
      */
    isRecursive: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(oElement.asInstanceOf[js.Any], oView.asInstanceOf[js.Any], isRecursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compile(
      /**
      * the DOM element to compile
      */
    oElement: Element,
      /**
      * The view instance to use
      */
    oView: typings.openui5.sapUiCoreMvcHtmlviewMod.default
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(oElement.asInstanceOf[js.Any], oView.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def compile(
      /**
      * the DOM element to compile
      */
    oElement: Element,
      /**
      * The view instance to use
      */
    oView: typings.openui5.sapUiCoreMvcHtmlviewMod.default,
      /**
      * Whether the call of the function is recursive.
      */
    isRecursive: Boolean
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("compile")(oElement.asInstanceOf[js.Any], oView.asInstanceOf[js.Any], isRecursive.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
  
  trait DeclarativeSupport extends StObject
}
