package typings.meteor.global

import typings.meteor.EJSONableCustomType
import typings.meteor.JSONable
import typings.meteor.anon.Canonical
import typings.meteor.anon.KeyOrderSensitive
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object EJSON {
  
  @JSGlobal("EJSON")
  @js.native
  val ^ : js.Any = js.native
  
  inline def addType(name: String, factory: js.Function1[/* val */ JSONable, EJSONableCustomType]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("addType")(name.asInstanceOf[js.Any], factory.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def clone_[T](`val`: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("clone")(`val`.asInstanceOf[js.Any]).asInstanceOf[T]
  
  inline def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def equals_(a: typings.meteor.EJSON, b: typings.meteor.EJSON, options: KeyOrderSensitive): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("equals")(a.asInstanceOf[js.Any], b.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def fromJSONValue(`val`: JSONable): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("fromJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[Any]
  
  inline def isBinary(x: js.Object): /* is std.Uint8Array */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isBinary")(x.asInstanceOf[js.Any]).asInstanceOf[/* is std.Uint8Array */ Boolean]
  
  inline def newBinary(size: Double): js.typedarray.Uint8Array = ^.asInstanceOf[js.Dynamic].applyDynamic("newBinary")(size.asInstanceOf[js.Any]).asInstanceOf[js.typedarray.Uint8Array]
  
  inline def parse(str: String): typings.meteor.EJSON = ^.asInstanceOf[js.Dynamic].applyDynamic("parse")(str.asInstanceOf[js.Any]).asInstanceOf[typings.meteor.EJSON]
  
  inline def stringify(`val`: typings.meteor.EJSON): String = ^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def stringify(`val`: typings.meteor.EJSON, options: Canonical): String = (^.asInstanceOf[js.Dynamic].applyDynamic("stringify")(`val`.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[String]
  
  inline def toJSONValue(`val`: typings.meteor.EJSON): JSONable = ^.asInstanceOf[js.Dynamic].applyDynamic("toJSONValue")(`val`.asInstanceOf[js.Any]).asInstanceOf[JSONable]
}
