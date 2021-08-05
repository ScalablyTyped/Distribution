package typings.openfin

import org.scalablytyped.runtime.StringDictionary
import typings.openfin.anon.BBG
import typings.openfin.anon.Dictkey
import typings.openfin.anon.LEI
import typings.openfin.openfinStrings.fdc3Dotcontact
import typings.openfin.openfinStrings.fdc3Dotinstrument
import typings.openfin.openfinStrings.fdc3Dotorganization
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMod {
  
  trait ContactContext
    extends StObject
       with Context {
    
    /**
      * The contact data. Can contain some or all of:
      * * `email`: Email address
      * * `twitter`: Twitter handle
      * * `phone`: Phone number
      */
    @JSName("id")
    var id_ContactContext: Dictkey
    
    /**
      * Free text name of the contact.
      */
    @JSName("name")
    var name_ContactContext: String
    
    /**
      * The context type is always 'fdc3.contact'.
      */
    @JSName("type")
    var type_ContactContext: fdc3Dotcontact
  }
  object ContactContext {
    
    inline def apply(id: Dictkey, name: String): ContactContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fdc3.contact")
      __obj.asInstanceOf[ContactContext]
    }
    
    extension [Self <: ContactContext](x: Self) {
      
      inline def setId(value: Dictkey): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setType(value: fdc3Dotcontact): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Context
    extends StObject
       with /**
    * @hidden
    * Custom properties and metadata. This can be extended in specific context object.
    */
  /* key */ StringDictionary[js.Any] {
    
    /**
      * An optional map of any equivalent identifiers for the context type, e.g. ISIN, CUSIP, etc. for an instrument.
      */
    var id: js.UndefOr[StringDictionary[js.UndefOr[String]]] = js.undefined
    
    /**
      * The name of the context data (optional). This is a text string that describes the data being sent.
      * Implementors of context may choose to make the name mandatory.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * The type of the context that uniquely identifies it, e.g. "fdc3.instrument".
      * This is used to refer to the accepted context(s) when declaring intents. See [[AppDirIntent]].
      */
    var `type`: String
  }
  object Context {
    
    inline def apply(`type`: String): Context = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Context]
    }
    
    extension [Self <: Context](x: Self) {
      
      inline def setId(value: StringDictionary[js.UndefOr[String]]): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait InstrumentContext
    extends StObject
       with Context {
    
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
    
    inline def apply(id: BBG): InstrumentContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fdc3.instrument")
      __obj.asInstanceOf[InstrumentContext]
    }
    
    extension [Self <: InstrumentContext](x: Self) {
      
      inline def setId(value: BBG): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: fdc3Dotinstrument): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait OrganizationContext
    extends StObject
       with Context {
    
    /**
      * The organization data. Can contain either or both
      * * `LEI`: [LEI](https://www.gleif.org/en/about-lei/introducing-the-legal-entity-identifier-lei)
      * * `PERMID`: [PERMID](https://permid.org/)
      */
    @JSName("id")
    var id_OrganizationContext: LEI
    
    /**
      * The context type is always fdc3.organization.
      */
    @JSName("type")
    var type_OrganizationContext: fdc3Dotorganization
  }
  object OrganizationContext {
    
    inline def apply(id: LEI): OrganizationContext = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
      __obj.updateDynamic("type")("fdc3.organization")
      __obj.asInstanceOf[OrganizationContext]
    }
    
    extension [Self <: OrganizationContext](x: Self) {
      
      inline def setId(value: LEI): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setType(value: fdc3Dotorganization): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
