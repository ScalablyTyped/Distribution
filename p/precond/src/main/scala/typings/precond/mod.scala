package typings.precond

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("precond", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def checkArgument(value: Any, message: String, formatArgs: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def checkArgument(value: Any, message: Unit, formatArgs: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkArgument")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  
  inline def checkIsArray(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsArray")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsArray(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsArray")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsBoolean(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsBoolean")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsBoolean(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsBoolean")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsDef(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsDef")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsDef(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsDef")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsDefAndNotNull(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsDefAndNotNull")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsDefAndNotNull(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsDefAndNotNull")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsFunction(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsFunction")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsFunction(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsFunction")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsNumber(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsNumber")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsNumber(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsNumber")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsObject(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsObject")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsObject(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsObject")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkIsString(value: Any, message: String, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsString")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  inline def checkIsString(value: Any, message: Unit, formatArgs: Any*): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("checkIsString")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Any]
  
  inline def checkState(value: Any, message: String, formatArgs: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
  inline def checkState(value: Any, message: Unit, formatArgs: Any*): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkState")((List(value.asInstanceOf[js.Any], message.asInstanceOf[js.Any])).`++`(formatArgs.asInstanceOf[Seq[js.Any]])*)).asInstanceOf[Unit]
}
