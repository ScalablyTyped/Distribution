package typings.novaEditorNode

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/// https://docs.nova.app/api-reference/console/
@js.native
trait Console extends StObject {
  
  def assert(condition: js.Function0[Any], message: String, params: Any*): Unit = js.native
  
  def clear(): Unit = js.native
  
  def count(): Unit = js.native
  def count(label: String): Unit = js.native
  
  def error(message: Any, params: Any*): Unit = js.native
  
  def group(): Unit = js.native
  
  def groupEnd(): Unit = js.native
  
  def info(message: Any, params: Any*): Unit = js.native
  
  def log(message: Any, params: Any*): Unit = js.native
  
  def time(label: String): Unit = js.native
  
  def timeEnd(label: String): Unit = js.native
  
  def timeStamp(): Unit = js.native
  def timeStamp(label: String): Unit = js.native
  
  def trace(): Unit = js.native
  
  def warn(message: Any, params: Any*): Unit = js.native
}
