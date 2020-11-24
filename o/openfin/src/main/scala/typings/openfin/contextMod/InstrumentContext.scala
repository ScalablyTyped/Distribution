package typings.openfin.contextMod

import typings.openfin.anon.BBG
import typings.openfin.openfinStrings.fdc3Dotinstrument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InstrumentContext extends Context {
  
  /**
    * The instrument data. Can contain some or all of:
    * * `ticker`: a ticker
    * * `ISIN`: [ISIN](https://www.isin.org/isin/)
    * * `CUSIP`: [CUSIP](https://www.cusip.com/cusip/index.htm)
    * * `SEDOL`: [SEDOL](https://www.londonstockexchange.com/products-and-services/reference-data/sedol-master-file/sedol-master-file.htm)
    * * `RIC`: [Reuters Instrument Code (RIC)](https://en.wikipedia.org/wiki/Reuters_Instrument_Code)
    * * `BBG`: [Bloomberg Ticker](https://www.bloomberg.com/professional/product/market-data/)
    * * `PERMID`: [PERMID](https://permid.org/)
    * * `FIGI`: [FIGI](https://www.openfigi.com/about/figi)
    */
  @JSName("id")
  var id_InstrumentContext: BBG = js.native
  
  /**
    * The context type is always 'fdc3.instrument'.
    */
  @JSName("type")
  var type_InstrumentContext: fdc3Dotinstrument = js.native
}
object InstrumentContext {
  
  @scala.inline
  def apply(id: BBG, `type`: fdc3Dotinstrument): InstrumentContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentContext]
  }
  
  @scala.inline
  implicit class InstrumentContextOps[Self <: InstrumentContext] (val x: Self) extends AnyVal {
    
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
    def setId(value: BBG): Self = this.set("id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: fdc3Dotinstrument): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
