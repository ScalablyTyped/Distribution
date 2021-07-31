package typings.officeJs.Office

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DocumentMode extends StObject
/**
  * Specifies whether the document in the associated application is read-only or read-write.
  * 
  * @remarks
  *  
  * Returned by the mode property of the {@link Office.Document | Document} object.
  */
@JSGlobal("Office.DocumentMode")
@js.native
object DocumentMode extends StObject {
  
  /**
    * The document is read-only.
    */
  @js.native
  sealed trait ReadOnly
    extends StObject
       with DocumentMode
  
  /**
    * The document can be read and written to.
    */
  @js.native
  sealed trait ReadWrite
    extends StObject
       with DocumentMode
}
