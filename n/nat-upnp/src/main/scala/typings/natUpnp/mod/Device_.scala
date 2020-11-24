package typings.natUpnp.mod

import typings.natUpnp.anon.ControlURL
import typings.natUpnp.anon.Devices
import typings.natUpnp.anon.`0`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Device_ extends js.Object {
  
  /**
    * Get the available services on the network device
    * @param types List of service types to lookf or
    * @param callback
    */
  def getService(types: js.Array[String], callback: CB[ControlURL]): Unit = js.native
  
  /**
    * Parse out available services
    * and devices from a root device
    * @param info
    * @returns the available devices and services in array form
    */
  def parseDescription(info: `0`): Devices = js.native
  
  /**
    * Perform a SSDP/UPNP request
    * @param action the action to perform
    * @param args arguments of said action
    * @param callback Callback to be run when completed, or on error
    */
  def run(action: String, args: js.Array[String], callback: CB[RawResponse]): Unit = js.native
}
object Device_ {
  
  @scala.inline
  def apply(
    getService: (js.Array[String], CB[ControlURL]) => Unit,
    parseDescription: `0` => Devices,
    run: (String, js.Array[String], CB[RawResponse]) => Unit
  ): Device_ = {
    val __obj = js.Dynamic.literal(getService = js.Any.fromFunction2(getService), parseDescription = js.Any.fromFunction1(parseDescription), run = js.Any.fromFunction3(run))
    __obj.asInstanceOf[Device_]
  }
  
  @scala.inline
  implicit class Device_Ops[Self <: Device_] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGetService(value: (js.Array[String], CB[ControlURL]) => Unit): Self = this.set("getService", js.Any.fromFunction2(value))
    
    @scala.inline
    def setParseDescription(value: `0` => Devices): Self = this.set("parseDescription", js.Any.fromFunction1(value))
    
    @scala.inline
    def setRun(value: (String, js.Array[String], CB[RawResponse]) => Unit): Self = this.set("run", js.Any.fromFunction3(value))
  }
}
