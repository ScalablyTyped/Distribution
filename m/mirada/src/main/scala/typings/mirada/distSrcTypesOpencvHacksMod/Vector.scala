package typings.mirada.distSrcTypesOpencvHacksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada/dist/src/types/opencv/_hacks", "Vector")
@js.native
open class Vector[T] () extends EmscriptenEmbindInstance {
  
  def delete(): Unit = js.native
  
  def get(i: Double): T = js.native
  def get(i: Double, j: Double, data: Any): T = js.native
  
  def push_back(n: T): Any = js.native
  
  def put(i: Double, j: Double, data: Any): Any = js.native
  
  def resize(count: Double): Unit = js.native
  def resize(count: Double, value: T): Unit = js.native
  
  def set(i: Double, t: T): Unit = js.native
}
