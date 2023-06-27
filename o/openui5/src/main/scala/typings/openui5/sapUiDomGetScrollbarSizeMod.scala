package typings.openui5

import typings.openui5.anon.Height
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomGetScrollbarSizeMod {
  
  @JSImport("sap/ui/dom/getScrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[Height]
  inline def default(/**
    * The CSS class that should be added to the test element.
    */
  sClasses: String): Height = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any]).asInstanceOf[Height]
  inline def default(
    /**
    * The CSS class that should be added to the test element.
    */
  sClasses: String,
    /**
    * Force recalculation of size (e.g. when CSS was changed). When no classes are passed all calculated sizes
    * are reset.
    */
  bForce: Boolean
  ): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any], bForce.asInstanceOf[js.Any])).asInstanceOf[Height]
  inline def default(
    /**
    * The CSS class that should be added to the test element.
    */
  sClasses: Unit,
    /**
    * Force recalculation of size (e.g. when CSS was changed). When no classes are passed all calculated sizes
    * are reset.
    */
  bForce: Boolean
  ): Height = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any], bForce.asInstanceOf[js.Any])).asInstanceOf[Height]
}
