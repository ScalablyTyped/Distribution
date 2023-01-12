package typings.openui5

import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object sapUiPerformanceTraceFesrhelperMod extends Shortcut {
  
  @JSImport("sap/ui/performance/trace/FESRHelper", JSImport.Default)
  @js.native
  val default: FESRHelper = js.native
  
  /**
    * @SINCE 1.100
    *
    * FESRHelper API Provides helper functionality for FESR and consumers of FESR
    */
  trait FESRHelper extends StObject {
    
    /**
      * @SINCE 1.100
      *
      * Get semantic stepname for an event of a given element used for FESR.
      *
      * @returns The semantic stepname for the given event ID
      */
    def getSemanticStepname(
      /**
      * The element conatining the semantic stepname
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The event ID of the semantic stepname
      */
    sEventId: String
    ): String
    
    /**
      * @SINCE 1.100
      *
      * Add semantic stepname for an event of a given element used for FESR.
      */
    def setSemanticStepname(
      /**
      * The element the semantic stepname should be applied to
      */
    oElement: typings.openui5.sapUiCoreElementMod.default,
      /**
      * The event ID the semantic stepname is valid for
      */
    sEventId: String,
      /**
      * The semantic stepname
      */
    sStepname: String
    ): Unit
  }
  object FESRHelper {
    
    inline def apply(
      getSemanticStepname: (typings.openui5.sapUiCoreElementMod.default, String) => String,
      setSemanticStepname: (typings.openui5.sapUiCoreElementMod.default, String, String) => Unit
    ): FESRHelper = {
      val __obj = js.Dynamic.literal(getSemanticStepname = js.Any.fromFunction2(getSemanticStepname), setSemanticStepname = js.Any.fromFunction3(setSemanticStepname))
      __obj.asInstanceOf[FESRHelper]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FESRHelper] (val x: Self) extends AnyVal {
      
      inline def setGetSemanticStepname(value: (typings.openui5.sapUiCoreElementMod.default, String) => String): Self = StObject.set(x, "getSemanticStepname", js.Any.fromFunction2(value))
      
      inline def setSetSemanticStepname(value: (typings.openui5.sapUiCoreElementMod.default, String, String) => Unit): Self = StObject.set(x, "setSemanticStepname", js.Any.fromFunction3(value))
    }
  }
  
  type _To = FESRHelper
  
  /* This means you don't have to write `default`, but can instead just say `sapUiPerformanceTraceFesrhelperMod.foo` */
  override def _to: FESRHelper = default
}
