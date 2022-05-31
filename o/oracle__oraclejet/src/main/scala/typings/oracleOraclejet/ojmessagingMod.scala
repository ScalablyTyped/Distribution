package typings.oracleOraclejet

import typings.oracleOraclejet.oracleOraclejetNumbers.`-1`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ojmessagingMod {
  
  @JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
  @js.native
  class ^ protected ()
    extends StObject
       with Message {
    def this(summary: String, detail: String) = this()
    def this(summary: String, detail: String, severity: SEVERITY_LEVEL) = this()
    def this(summary: String, detail: String, severity: SEVERITY_TYPE) = this()
    
    /* CompleteClass */
    var detail: String = js.native
    
    /* CompleteClass */
    var severity: SEVERITY_TYPE | SEVERITY_LEVEL = js.native
    
    /* CompleteClass */
    var summary: String = js.native
  }
  @JSImport("@oracle/oraclejet/ojmessaging", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* static member */
  inline def getMaxSeverity(): SEVERITY_LEVEL | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxSeverity")().asInstanceOf[SEVERITY_LEVEL | `-1`]
  inline def getMaxSeverity(messages: js.Array[Message]): SEVERITY_LEVEL | `-1` = ^.asInstanceOf[js.Dynamic].applyDynamic("getMaxSeverity")(messages.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL | `-1`]
  
  /* static member */
  inline def getSeverityLevel(): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")().asInstanceOf[SEVERITY_LEVEL]
  inline def getSeverityLevel(severity: SEVERITY_LEVEL): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL]
  inline def getSeverityLevel(severity: SEVERITY_TYPE): SEVERITY_LEVEL = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityLevel")(severity.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_LEVEL]
  
  /* static member */
  inline def getSeverityType(): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")().asInstanceOf[SEVERITY_TYPE]
  inline def getSeverityType(level: SEVERITY_LEVEL): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")(level.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_TYPE]
  inline def getSeverityType(level: SEVERITY_TYPE): SEVERITY_TYPE = ^.asInstanceOf[js.Dynamic].applyDynamic("getSeverityType")(level.asInstanceOf[js.Any]).asInstanceOf[SEVERITY_TYPE]
  
  /* static member */
  inline def isValid(messages: js.Array[Message]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isValid")(messages.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait Message extends StObject {
    
    var detail: String
    
    var severity: SEVERITY_TYPE | SEVERITY_LEVEL
    
    var summary: String
  }
  object Message {
    
    inline def apply(detail: String, severity: SEVERITY_TYPE | SEVERITY_LEVEL, summary: String): Message = {
      val __obj = js.Dynamic.literal(detail = detail.asInstanceOf[js.Any], severity = severity.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
      __obj.asInstanceOf[Message]
    }
    
    extension [Self <: Message](x: Self) {
      
      inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      inline def setSeverity(value: SEVERITY_TYPE | SEVERITY_LEVEL): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
      
      inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetNumbers.`5`
    - typings.oracleOraclejet.oracleOraclejetNumbers.`4`
    - typings.oracleOraclejet.oracleOraclejetNumbers.`3`
    - typings.oracleOraclejet.oracleOraclejetNumbers.`2`
    - typings.oracleOraclejet.oracleOraclejetNumbers.`1`
  */
  trait SEVERITY_LEVEL extends StObject
  object SEVERITY_LEVEL {
    
    inline def `1`: typings.oracleOraclejet.oracleOraclejetNumbers.`1` = 1.asInstanceOf[typings.oracleOraclejet.oracleOraclejetNumbers.`1`]
    
    inline def `2`: typings.oracleOraclejet.oracleOraclejetNumbers.`2` = 2.asInstanceOf[typings.oracleOraclejet.oracleOraclejetNumbers.`2`]
    
    inline def `3`: typings.oracleOraclejet.oracleOraclejetNumbers.`3` = 3.asInstanceOf[typings.oracleOraclejet.oracleOraclejetNumbers.`3`]
    
    inline def `4`: typings.oracleOraclejet.oracleOraclejetNumbers.`4` = 4.asInstanceOf[typings.oracleOraclejet.oracleOraclejetNumbers.`4`]
    
    inline def `5`: typings.oracleOraclejet.oracleOraclejetNumbers.`5` = 5.asInstanceOf[typings.oracleOraclejet.oracleOraclejetNumbers.`5`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.oracleOraclejet.oracleOraclejetStrings.confirmation
    - typings.oracleOraclejet.oracleOraclejetStrings.info
    - typings.oracleOraclejet.oracleOraclejetStrings.warning
    - typings.oracleOraclejet.oracleOraclejetStrings.error
    - typings.oracleOraclejet.oracleOraclejetStrings.fatal
  */
  trait SEVERITY_TYPE extends StObject
  object SEVERITY_TYPE {
    
    inline def confirmation: typings.oracleOraclejet.oracleOraclejetStrings.confirmation = "confirmation".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.confirmation]
    
    inline def error: typings.oracleOraclejet.oracleOraclejetStrings.error = "error".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.error]
    
    inline def fatal: typings.oracleOraclejet.oracleOraclejetStrings.fatal = "fatal".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.fatal]
    
    inline def info: typings.oracleOraclejet.oracleOraclejetStrings.info = "info".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.info]
    
    inline def warning: typings.oracleOraclejet.oracleOraclejetStrings.warning = "warning".asInstanceOf[typings.oracleOraclejet.oracleOraclejetStrings.warning]
  }
}
