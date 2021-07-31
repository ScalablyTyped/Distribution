package typings.onfleetNodeOnfleet

import typings.onfleetNodeOnfleet.anon.Apartment
import typings.onfleetNodeOnfleet.metadataMod.OnfleetMetadata
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object destinationsMod {
  
  @JSImport("@onfleet/node-onfleet/Resources/Destinations", JSImport.Namespace)
  @js.native
  class ^ ()
    extends StObject
       with Destination {
    
    /* CompleteClass */
    override def create(destination: CreateDestinationProps): js.Promise[OnfleetDestination] = js.native
    
    /* CompleteClass */
    override def get(id: String): js.Promise[OnfleetDestination] = js.native
  }
  
  trait CreateDestinationProps extends StObject {
    
    var address: DestinationAddress
    
    var location: js.UndefOr[Location] = js.undefined
    
    var notes: js.UndefOr[String] = js.undefined
  }
  object CreateDestinationProps {
    
    @scala.inline
    def apply(address: DestinationAddress): CreateDestinationProps = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreateDestinationProps]
    }
    
    @scala.inline
    implicit class CreateDestinationPropsMutableBuilder[Self <: CreateDestinationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: DestinationAddress): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocationUndefined: Self = StObject.set(x, "location", js.undefined)
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNotesUndefined: Self = StObject.set(x, "notes", js.undefined)
    }
  }
  
  trait Destination extends StObject {
    
    def create(destination: CreateDestinationProps): js.Promise[OnfleetDestination]
    
    def get(id: String): js.Promise[OnfleetDestination]
  }
  object Destination {
    
    @scala.inline
    def apply(
      create: CreateDestinationProps => js.Promise[OnfleetDestination],
      get: String => js.Promise[OnfleetDestination]
    ): Destination = {
      val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), get = js.Any.fromFunction1(get))
      __obj.asInstanceOf[Destination]
    }
    
    @scala.inline
    implicit class DestinationMutableBuilder[Self <: Destination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCreate(value: CreateDestinationProps => js.Promise[OnfleetDestination]): Self = StObject.set(x, "create", js.Any.fromFunction1(value))
      
      @scala.inline
      def setGet(value: String => js.Promise[OnfleetDestination]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
    }
  }
  
  /**
    * @prop { string } [apartment] - The suite or apartment number, or any additional relevant information.
    * @prop { string } city - The name of the municipality.
    * @prop { string } country - The name of the country.
    * @prop { string } [name] - A name associated with this address, for example, "Transamerica Pyramid".
    * @prop { string } number - The number component of this address, it may also contain letters.
    * @prop { string } [postalCode] - The postal or zip code.
    * @prop { string } [state] - The name of the state, province or jurisdiction.
    * @prop { string } street - The name of the street.
    * @prop { string } [unparsed] - A complete address specified in a single, unparsed string where the various elements are separated by commas.
    * * If present, all other address properties will be ignored (with the exception of name and apartment).
    * * In some countries, you may skip most address details (like city or state) if you provide a valid postalCode:
    *  for example, 325 Front Street W., M5V 3B5, CA will be geocoded correctly.
    */
  trait DestinationAddress extends StObject {
    
    var apartment: js.UndefOr[String] = js.undefined
    
    var city: String
    
    var country: String
    
    var name: js.UndefOr[String] = js.undefined
    
    var number: String
    
    var postalCode: js.UndefOr[String] = js.undefined
    
    var state: js.UndefOr[String] = js.undefined
    
    var street: String
    
    var unparsed: js.UndefOr[String] = js.undefined
  }
  object DestinationAddress {
    
    @scala.inline
    def apply(city: String, country: String, number: String, street: String): DestinationAddress = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], street = street.asInstanceOf[js.Any])
      __obj.asInstanceOf[DestinationAddress]
    }
    
    @scala.inline
    implicit class DestinationAddressMutableBuilder[Self <: DestinationAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setApartment(value: String): Self = StObject.set(x, "apartment", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setApartmentUndefined: Self = StObject.set(x, "apartment", js.undefined)
      
      @scala.inline
      def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
      
      @scala.inline
      def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
      
      @scala.inline
      def setStreet(value: String): Self = StObject.set(x, "street", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnparsed(value: String): Self = StObject.set(x, "unparsed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnparsedUndefined: Self = StObject.set(x, "unparsed", js.undefined)
    }
  }
  
  type Latitude = Double
  
  type Location = js.Tuple2[Longitude, Latitude]
  
  type Longitude = Double
  
  trait OnfleetDestination extends StObject {
    
    var address: Apartment
    
    var id: String
    
    var location: Location
    
    var metadata: js.Array[OnfleetMetadata]
    
    var notes: String
    
    var timeCreated: Double
    
    var timeLastModified: Double
  }
  object OnfleetDestination {
    
    @scala.inline
    def apply(
      address: Apartment,
      id: String,
      location: Location,
      metadata: js.Array[OnfleetMetadata],
      notes: String,
      timeCreated: Double,
      timeLastModified: Double
    ): OnfleetDestination = {
      val __obj = js.Dynamic.literal(address = address.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], location = location.asInstanceOf[js.Any], metadata = metadata.asInstanceOf[js.Any], notes = notes.asInstanceOf[js.Any], timeCreated = timeCreated.asInstanceOf[js.Any], timeLastModified = timeLastModified.asInstanceOf[js.Any])
      __obj.asInstanceOf[OnfleetDestination]
    }
    
    @scala.inline
    implicit class OnfleetDestinationMutableBuilder[Self <: OnfleetDestination] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddress(value: Apartment): Self = StObject.set(x, "address", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLocation(value: Location): Self = StObject.set(x, "location", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadata(value: js.Array[OnfleetMetadata]): Self = StObject.set(x, "metadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMetadataVarargs(value: OnfleetMetadata*): Self = StObject.set(x, "metadata", js.Array(value :_*))
      
      @scala.inline
      def setNotes(value: String): Self = StObject.set(x, "notes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeCreated(value: Double): Self = StObject.set(x, "timeCreated", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeLastModified(value: Double): Self = StObject.set(x, "timeLastModified", value.asInstanceOf[js.Any])
    }
  }
}
