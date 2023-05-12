package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcArrayFlatMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/array/flat", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def flat[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flat")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
  
  inline def flatDeep(arr: js.Array[Any]): js.Array[Any] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatDeep")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[Any]]
  
  inline def flatInstallArrayPrototype(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("flatInstallArrayPrototype")().asInstanceOf[Unit]
  
  inline def flatReadOnly[T](arr: js.Array[js.Array[T]]): js.Array[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("flatReadOnly")(arr.asInstanceOf[js.Any]).asInstanceOf[js.Array[T]]
}
