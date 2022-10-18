package typings.openui5

import typings.openui5.anon.HeightWidth
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiDomGetScrollbarSizeMod {
  
  @JSImport("sap/ui/dom/getScrollbarSize", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): HeightWidth = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[HeightWidth]
  inline def default(/**
    * The CSS class that should be added to the test element.
    */
  sClasses: String): HeightWidth = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any]).asInstanceOf[HeightWidth]
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
  ): HeightWidth = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any], bForce.asInstanceOf[js.Any])).asInstanceOf[HeightWidth]
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
  ): HeightWidth = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(sClasses.asInstanceOf[js.Any], bForce.asInstanceOf[js.Any])).asInstanceOf[HeightWidth]
}
