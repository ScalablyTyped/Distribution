package typings.plv8Internal

import typings.plv8Internal.SeekType.WINDOW_SEEK_CURRENT
import typings.plv8Internal.SeekType.WINDOW_SEEK_HEAD
import typings.plv8Internal.SeekType.WINDOW_SEEK_TAIL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WindowObject extends StObject {
  
  var SEEK_CURRENT: WINDOW_SEEK_CURRENT = js.native
  
  var SEEK_HEAD: WINDOW_SEEK_HEAD = js.native
  
  var SEEK_TAIL: WINDOW_SEEK_TAIL = js.native
  
  def get_current_position(): Double = js.native
  
  def get_func_arg_current(arg: Double): Any = js.native
  
  def get_func_arg_in_frame(arg: Double, position: Double, seekType: SeekType, mark: Boolean): Any = js.native
  
  def get_func_arg_in_partition(arg: Double, position: Double, seekType: SeekType, mark: Boolean): Any = js.native
  
  def get_partition_local(): Any = js.native
  def get_partition_local(size: Double): Any = js.native
  
  def get_partition_row_count(): Double = js.native
  
  def rows_are_peers(pos1: Double, pos2: Double): Boolean = js.native
  
  def set_mark_position(position: Double): Unit = js.native
  
  def set_partition_local(obj: Any): Unit = js.native
}
