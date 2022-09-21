package typings.pixiSpineBase.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@pixi-spine/base", "StringSet")
@js.native
open class StringSet () extends StObject {
  
  def add(value: String): Boolean = js.native
  
  def addAll(values: js.Array[String]): Boolean = js.native
  
  def clear(): Unit = js.native
  
  def contains(value: String): Boolean = js.native
  
  var entries: StringMap[Boolean] = js.native
  
  var size: Double = js.native
}
