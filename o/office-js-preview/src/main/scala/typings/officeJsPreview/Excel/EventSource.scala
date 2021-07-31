package typings.officeJsPreview.Excel

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait EventSource extends StObject
/**
  * [Api set: ExcelApi 1.7]
  */
@JSGlobal("Excel.EventSource")
@js.native
object EventSource extends StObject {
  
  /**
    * Local means event comes from local user session.
    *
    */
  @js.native
  sealed trait local
    extends StObject
       with EventSource
  
  /**
    * Remote means event comes from remote user session.
    *
    */
  @js.native
  sealed trait remote
    extends StObject
       with EventSource
}
