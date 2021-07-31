package typings.openui5.sap.ui.model

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object `type` {
  
  @js.native
  trait Boolean
    extends StObject
       with SimpleType
  
  @js.native
  trait Currency
    extends StObject
       with CompositeType {
    
    def formatValue(vValue: java.lang.String, sInternalType: java.lang.String): js.Any = js.native
  }
  
  @js.native
  trait Date
    extends StObject
       with SimpleType {
    
    /**
      */
    def getOutputPattern(): Unit = js.native
  }
  
  @js.native
  trait DateTime
    extends StObject
       with Date
  
  @js.native
  trait FileSize
    extends StObject
       with SimpleType
  
  @js.native
  trait Float
    extends StObject
       with SimpleType
  
  @js.native
  trait Integer
    extends StObject
       with SimpleType
  
  @js.native
  trait String
    extends StObject
       with SimpleType
  
  @js.native
  trait Time
    extends StObject
       with Date
}
