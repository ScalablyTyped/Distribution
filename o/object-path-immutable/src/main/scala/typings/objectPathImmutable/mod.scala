package typings.objectPathImmutable

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("object-path-immutable", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def assign[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("assign")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def assign[T](src: T, path: Unit, source: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assign[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def assign[T](src: T, path: Path, source: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("assign")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def del[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("del")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def del[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("del")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def get[T, S](src: T): S = ^.asInstanceOf[js.Dynamic].applyDynamic("get")(src.asInstanceOf[js.Any]).asInstanceOf[S]
  inline def get[T, S](src: T, path: Unit, defaultValue: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[S]
  inline def get[T, S](src: T, path: Path): S = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[S]
  inline def get[T, S](src: T, path: Path, defaultValue: S): S = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], defaultValue.asInstanceOf[js.Any])).asInstanceOf[S]
  
  inline def insert[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def insert[T](src: T, path: Unit, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Unit, value: Any, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Unit, value: Unit, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Path, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Path, value: Any, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def insert[T](src: T, path: Path, value: Unit, index: Double): T = (^.asInstanceOf[js.Dynamic].applyDynamic("insert")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any], index.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def merge[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("merge")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def merge[T](src: T, path: Unit, source: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def merge[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def merge[T](src: T, path: Path, source: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("merge")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], source.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def push[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("push")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def push[T](src: T, path: Unit, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def push[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def push[T](src: T, path: Path, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("push")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def set[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("set")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def set[T](src: T, path: Unit, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def set[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def set[T](src: T, path: Path, value: Any): T = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def update[T](src: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("update")(src.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def update[T](src: T, path: Unit, updater: js.Function1[/* formerValue */ Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def update[T](src: T, path: Path): T = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def update[T](src: T, path: Path, updater: js.Function1[/* formerValue */ Any, Any]): T = (^.asInstanceOf[js.Dynamic].applyDynamic("update")(src.asInstanceOf[js.Any], path.asInstanceOf[js.Any], updater.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def wrap[T](obj: T): WrappedObject[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(obj.asInstanceOf[js.Any]).asInstanceOf[WrappedObject[T]]
}
