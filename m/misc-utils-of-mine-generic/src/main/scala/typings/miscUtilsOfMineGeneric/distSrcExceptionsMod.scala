package typings.miscUtilsOfMineGeneric

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcExceptionsMod {
  
  @JSImport("misc-utils-of-mine-generic/dist/src/exceptions", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkThrow[T](): T = ^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")().asInstanceOf[T]
  inline def checkThrow[T](r: T): T = ^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any]).asInstanceOf[T]
  inline def checkThrow[T](r: T, msg: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[T]
  inline def checkThrow[T](r: Unit, msg: String): T = (^.asInstanceOf[js.Dynamic].applyDynamic("checkThrow")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[T]
  
  inline def checkTruthy[T](): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")().asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: T): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any]).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: T, msg: String): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  inline def checkTruthy[T](r: Unit, msg: String): /* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("checkTruthy")(r.asInstanceOf[js.Any], msg.asInstanceOf[js.Any])).asInstanceOf[/* is misc-utils-of-mine-generic.misc-utils-of-mine-generic/dist/src/type.NotFalsy<T> */ Boolean]
  
  inline def tryTo[R, D](f: js.Function1[/* repeated */ Any, R]): js.UndefOr[R | D] = ^.asInstanceOf[js.Dynamic].applyDynamic("tryTo")(f.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[R | D]]
  inline def tryTo[R, D](f: js.Function1[/* repeated */ Any, R], `def`: D): js.UndefOr[R | D] = (^.asInstanceOf[js.Dynamic].applyDynamic("tryTo")(f.asInstanceOf[js.Any], `def`.asInstanceOf[js.Any])).asInstanceOf[js.UndefOr[R | D]]
}
