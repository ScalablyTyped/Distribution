package typings.pixiCore.mod

import org.scalablytyped.runtime.NumberDictionary
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITypedArray
  extends StObject
     with ArrayBuffer
     with /* index */ NumberDictionary[Double] {
  
  val BYTES_PER_ELEMENT: Double = js.native
  
  val length: Double = js.native
}
