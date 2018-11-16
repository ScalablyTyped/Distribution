package typings
package moonjsLib.moonjsMod.MoonNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Instance[Data] extends js.Object {
  @JSName("$data")
  var $data: Data = js.native
  def build(): scala.Unit = js.native
  def callMethod[K /* <: java.lang.String */](methodName: K): js.Any = js.native
  def callMethod[K /* <: java.lang.String */](methodName: K, params: js.Array[_]): js.Any = js.native
  def destroy(): scala.Unit = js.native
  def emit(eventName: java.lang.String): scala.Unit = js.native
  def emit(eventName: java.lang.String, data: js.Any): scala.Unit = js.native
  def get[K /* <: java.lang.String */](name: K): /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Data))),List()),Left(TsIdentSimple(K))) */js.Any = js.native
  def mount(selector: java.lang.String): scala.Unit = js.native
  def off(): scala.Unit = js.native
  def off(eventName: java.lang.String): scala.Unit = js.native
  def off(eventName: java.lang.String, listener: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def on(eventName: java.lang.String, listener: js.Function1[/* event */ stdLib.Event, scala.Unit]): scala.Unit = js.native
  def set[K /* <: java.lang.String */](
    name: K,
    value: /* import warning: Failed type conversion: TsTypeLookup(TsTypeRef(TsQIdent(List(TsIdentSimple(Data))),List()),Left(TsIdentSimple(K))) */js.Any
  ): scala.Unit = js.native
}

