package typings.plv8Internal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait LoggingLevel extends StObject
@JSGlobal("LoggingLevel")
@js.native
object LoggingLevel extends StObject {
  
  @js.native
  sealed trait DEBUG1
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait DEBUG2
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait DEBUG3
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait DEBUG4
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait DEBUG5
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait ERROR
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait INFO
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait LOG
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait NOTICE
    extends StObject
       with LoggingLevel
  
  @js.native
  sealed trait WARNING
    extends StObject
       with LoggingLevel
}
