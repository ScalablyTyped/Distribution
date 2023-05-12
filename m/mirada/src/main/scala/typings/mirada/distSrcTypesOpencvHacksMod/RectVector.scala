package typings.mirada.distSrcTypesOpencvHacksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
- typings.mirada.distSrcTypesOpencvHacksMod.EmscriptenEmbindInstance because Inheritance from two classes. Inlined isAliasOf, clone, isDeleted, deleteLater
- typings.mirada.distSrcTypesOpencvHacksMod.Vector because Inheritance from two classes. Inlined delete, get, get, set, put, push_back, resize, resize */ @JSImport("mirada/dist/src/types/opencv/_hacks", "RectVector")
@js.native
open class RectVector () extends Rect {
  def this(point: Point, size: Size) = this()
  def this(x: Double, y: Double, width: Double, height: Double) = this()
  
  def clone(a: Any*): Any = js.native
  
  def delete(): Unit = js.native
  def delete(a: Any*): Any = js.native
  
  def deleteLater(a: Any*): Any = js.native
  
  def get(i: Double): Rect = js.native
  def get(i: Double, j: Double, data: Any): Rect = js.native
  
  def isAliasOf(a: Any*): Any = js.native
  
  def isDeleted(a: Any*): Any = js.native
  
  def push_back(n: Rect): Any = js.native
  @JSName("push_back")
  def push_back_Unit(n: Rect): Unit = js.native
  
  def put(i: Double, j: Double, data: Any): Any = js.native
  
  def resize(count: Double): Unit = js.native
  def resize(count: Double, value: Rect): Unit = js.native
  
  def set(i: Double, t: Rect): Unit = js.native
  
  def size(): Double = js.native
}
