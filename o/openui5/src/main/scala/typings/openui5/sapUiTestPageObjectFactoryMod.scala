package typings.openui5

import typings.openui5.sapUiTestOpa5Mod.PageObjectDefinition
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiTestPageObjectFactoryMod {
  
  @JSImport("sap/ui/test/PageObjectFactory", JSImport.Default)
  @js.native
  /**
    * Protected:  Do not call from applications (only from related classes in the framework)
    */
  open class default ()
    extends typings.openui5.sapUiBaseObjectMod.default
  /* static members */
  object default {
    
    @JSImport("sap/ui/test/PageObjectFactory", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * Protected:  Do not call from applications (only from related classes in the framework)
      *
      * Creates a set of page objects, each consisting of actions and assertions, and adds them to the Opa configuration.
      *
      * Use page objects to structure your actions and assertions based on parts of the screen. This helps to
      * avoid name clashes and to structure your tests.
      * See:
      * 	sap.ui.test.Opa5.createPageObjects
      *
      * @returns Map of created page objects
      */
    inline def create(
      /**
      * Definitions of 1 or more page objects
      */
    mPageDefinitions: Record[String, PageObjectDefinition],
      /**
      * Opa5 class, provided as parameter to avoid a circular dependency
      */
    Opa5: typings.openui5.sapUiTestOpa5Mod.default
    ): Record[String, js.Object] = (^.asInstanceOf[js.Dynamic].applyDynamic("create")(mPageDefinitions.asInstanceOf[js.Any], Opa5.asInstanceOf[js.Any])).asInstanceOf[Record[String, js.Object]]
  }
  
  type PageObjectFactory = typings.openui5.sapUiBaseObjectMod.default
}
