package typings.plv8Internal

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Cursor extends StObject {
  
  def close(): Unit = js.native
  
  def fetch(): SQLRow | js.Array[SQLRow] = js.native
  def fetch(count: Double): SQLRow | js.Array[SQLRow] = js.native
  
  def move(count: Double): Unit = js.native
}
