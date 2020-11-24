package typings.openui5.sap.ui.model

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("sap.ui.model.type")
@js.native
object `type` extends js.Object {
  
  @js.native
  trait Boolean extends SimpleType
  
  @js.native
  trait Currency extends CompositeType {
    
    def formatValue(vValue: java.lang.String, sInternalType: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait Date extends SimpleType {
    
    /**
      */
    def getOutputPattern(): Unit = js.native
  }
  
  @js.native
  trait DateTime extends Date
  
  @js.native
  trait FileSize extends SimpleType
  
  @js.native
  trait Float extends SimpleType
  
  @js.native
  trait Integer extends SimpleType
  
  @js.native
  trait String extends SimpleType
  
  @js.native
  trait Time extends Date
}
