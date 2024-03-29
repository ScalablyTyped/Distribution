package typings.minappEnv.global

import typings.minappEnv.ArrayLike
import typings.minappEnv.IterableIterator
import typings.minappEnv.PropertyDescriptor
import typings.minappEnv.PropertyKey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Reflect {
  
  @JSGlobal("Reflect")
  @js.native
  val ^ : js.Any = js.native
  
  inline def apply(target: typings.minappEnv.Function, thisArgument: Any, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(target.asInstanceOf[js.Any], thisArgument.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def construct(target: typings.minappEnv.Function, argumentsList: ArrayLike[Any]): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def construct(target: typings.minappEnv.Function, argumentsList: ArrayLike[Any], newTarget: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("construct")(target.asInstanceOf[js.Any], argumentsList.asInstanceOf[js.Any], newTarget.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def defineProperty(target: js.Object, propertyKey: PropertyKey, attributes: PropertyDescriptor): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("defineProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], attributes.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def deleteProperty(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("deleteProperty")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def enumerate(target: js.Object): IterableIterator[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("enumerate")(target.asInstanceOf[js.Any]).asInstanceOf[IterableIterator[Any]]
  
  inline def get(target: js.Object, propertyKey: PropertyKey): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[Any]
  inline def get(target: js.Object, propertyKey: PropertyKey, receiver: Any): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def getOwnPropertyDescriptor(target: js.Object, propertyKey: PropertyKey): js.UndefOr[PropertyDescriptor] = (^.asInstanceOf[js.Dynamic].applyDynamic("getOwnPropertyDescriptor")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[PropertyDescriptor]]
  
  inline def getPrototypeOf(target: js.Object): js.Object = ^.asInstanceOf[js.Dynamic].applyDynamic("getPrototypeOf")(target.asInstanceOf[js.Any]).asInstanceOf[js.Object]
  
  inline def has(target: js.Object, propertyKey: PropertyKey): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("has")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def isExtensible(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isExtensible")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def ownKeys(target: js.Object): typings.minappEnv.Array[PropertyKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("ownKeys")(target.asInstanceOf[js.Any]).asInstanceOf[typings.minappEnv.Array[PropertyKey]]
  
  inline def preventExtensions(target: js.Object): scala.Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("preventExtensions")(target.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  inline def set(target: js.Object, propertyKey: PropertyKey, value: Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  inline def set(target: js.Object, propertyKey: PropertyKey, value: Any, receiver: Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(target.asInstanceOf[js.Any], propertyKey.asInstanceOf[js.Any], value.asInstanceOf[js.Any], receiver.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
  
  inline def setPrototypeOf(target: js.Object, proto: Any): scala.Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("setPrototypeOf")(target.asInstanceOf[js.Any], proto.asInstanceOf[js.Any])).asInstanceOf[scala.Boolean]
}
