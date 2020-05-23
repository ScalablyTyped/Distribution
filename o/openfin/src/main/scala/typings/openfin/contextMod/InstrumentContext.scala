package typings.openfin.contextMod

import typings.openfin.anon.BBG
import typings.openfin.openfinStrings.fdc3Dotinstrument
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  var id_InstrumentContext: BBG
  /**
    * The context type is always 'fdc3.instrument'.
    */
  @JSName("type")
  var type_InstrumentContext: fdc3Dotinstrument
}

object InstrumentContext {
  @scala.inline
  def apply(id: BBG, `type`: fdc3Dotinstrument, name: String = null): InstrumentContext = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[InstrumentContext]
  }
}

