package typings.pdfjsDist.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * A PDF document and page is built of many objects.  E.g. there are objects for fonts, images, rendering code and such.  These objects might get processed inside of a worker.  The `PDFObjects` implements some basic functions to manage these objects.
  **/
@js.native
trait PDFObjects extends StObject {
  
  def clear(): Unit = js.native
  
  def get(objId: Double): js.Any = js.native
  def get(objId: Double, callback: js.Any): js.Any = js.native
  
  def getData(objId: Double): js.Any = js.native
  
  def hasData(objId: Double): Boolean = js.native
  
  def isResolved(objId: Double): Boolean = js.native
  
  def resolve(objId: Double, data: js.Any): js.Any = js.native
}
