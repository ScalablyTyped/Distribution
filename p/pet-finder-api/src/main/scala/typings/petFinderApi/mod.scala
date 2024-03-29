package typings.petFinderApi

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(api_key: String, api_secret: String): PetFinder = (^.asInstanceOf[js.Dynamic].apply(api_key.asInstanceOf[js.Any], api_secret.asInstanceOf[js.Any])).asInstanceOf[PetFinder]
  inline def apply(api_key: String, api_secret: String, options: Any): PetFinder = (^.asInstanceOf[js.Dynamic].apply(api_key.asInstanceOf[js.Any], api_secret.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PetFinder]
  
  @JSImport("pet-finder-api", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Contact extends StObject {
    
    var address1: String
    
    var address2: String
    
    var city: String
    
    var email: String
    
    var fax: String
    
    var phone: String
    
    var state: String
    
    var zip: String
  }
  object Contact {
    
    inline def apply(
      address1: String,
      address2: String,
      city: String,
      email: String,
      fax: String,
      phone: String,
      state: String,
      zip: String
    ): Contact = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Contact]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Contact] (val x: Self) extends AnyVal {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
  
  trait Pet extends StObject {
    
    var age: String
    
    var animal: String
    
    var breeds: js.Array[String]
    
    var contact: Contact
    
    var description: String
    
    var id: Double
    
    var media: Any
    
    var mix: String
    
    var name: String
    
    var options: js.Array[String]
    
    var sex: String
    
    var shelterId: String
    
    var shelterPetId: String
    
    var size: String
    
    var status: String
  }
  object Pet {
    
    inline def apply(
      age: String,
      animal: String,
      breeds: js.Array[String],
      contact: Contact,
      description: String,
      id: Double,
      media: Any,
      mix: String,
      name: String,
      options: js.Array[String],
      sex: String,
      shelterId: String,
      shelterPetId: String,
      size: String,
      status: String
    ): Pet = {
      val __obj = js.Dynamic.literal(age = age.asInstanceOf[js.Any], animal = animal.asInstanceOf[js.Any], breeds = breeds.asInstanceOf[js.Any], contact = contact.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], media = media.asInstanceOf[js.Any], mix = mix.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], options = options.asInstanceOf[js.Any], sex = sex.asInstanceOf[js.Any], shelterId = shelterId.asInstanceOf[js.Any], shelterPetId = shelterPetId.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[Pet]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Pet] (val x: Self) extends AnyVal {
      
      inline def setAge(value: String): Self = StObject.set(x, "age", value.asInstanceOf[js.Any])
      
      inline def setAnimal(value: String): Self = StObject.set(x, "animal", value.asInstanceOf[js.Any])
      
      inline def setBreeds(value: js.Array[String]): Self = StObject.set(x, "breeds", value.asInstanceOf[js.Any])
      
      inline def setBreedsVarargs(value: String*): Self = StObject.set(x, "breeds", js.Array(value*))
      
      inline def setContact(value: Contact): Self = StObject.set(x, "contact", value.asInstanceOf[js.Any])
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setMedia(value: Any): Self = StObject.set(x, "media", value.asInstanceOf[js.Any])
      
      inline def setMix(value: String): Self = StObject.set(x, "mix", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOptions(value: js.Array[String]): Self = StObject.set(x, "options", value.asInstanceOf[js.Any])
      
      inline def setOptionsVarargs(value: String*): Self = StObject.set(x, "options", js.Array(value*))
      
      inline def setSex(value: String): Self = StObject.set(x, "sex", value.asInstanceOf[js.Any])
      
      inline def setShelterId(value: String): Self = StObject.set(x, "shelterId", value.asInstanceOf[js.Any])
      
      inline def setShelterPetId(value: String): Self = StObject.set(x, "shelterPetId", value.asInstanceOf[js.Any])
      
      inline def setSize(value: String): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: String): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  trait PetFinder extends StObject {
    
    def findPet(options: Any, callback: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]): Unit
    
    def findShelter(
      location: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit
    
    def getBreedList(animal: String, callback: js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]): Unit
    
    def getPet(petId: Double, options: Any, callback: js.Function2[/* error */ Any, /* pet */ Pet, Unit]): Unit
    
    def getPetsInShelter(
      shelterId: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]
    ): Unit
    
    def getRandomPet(options: Any, callback: js.Function2[/* error */ Any, /* pet */ Pet, Unit]): Unit
    
    def getShelter(
      shelterId: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]
    ): Unit
    
    def getSheltersWithBreeds(
      animal: String,
      breed: String,
      options: Any,
      callback: js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]
    ): Unit
  }
  object PetFinder {
    
    inline def apply(
      findPet: (Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Unit,
      findShelter: (String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Unit,
      getBreedList: (String, js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => Unit,
      getPet: (Double, Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Unit,
      getPetsInShelter: (String, Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Unit,
      getRandomPet: (Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Unit,
      getShelter: (String, Any, js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => Unit,
      getSheltersWithBreeds: (String, String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): PetFinder = {
      val __obj = js.Dynamic.literal(findPet = js.Any.fromFunction2(findPet), findShelter = js.Any.fromFunction3(findShelter), getBreedList = js.Any.fromFunction2(getBreedList), getPet = js.Any.fromFunction3(getPet), getPetsInShelter = js.Any.fromFunction3(getPetsInShelter), getRandomPet = js.Any.fromFunction2(getRandomPet), getShelter = js.Any.fromFunction3(getShelter), getSheltersWithBreeds = js.Any.fromFunction4(getSheltersWithBreeds))
      __obj.asInstanceOf[PetFinder]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PetFinder] (val x: Self) extends AnyVal {
      
      inline def setFindPet(value: (Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = StObject.set(x, "findPet", js.Any.fromFunction2(value))
      
      inline def setFindShelter(
        value: (String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
      ): Self = StObject.set(x, "findShelter", js.Any.fromFunction3(value))
      
      inline def setGetBreedList(value: (String, js.Function2[/* err */ Any, /* breedArray */ js.Array[String], Unit]) => Unit): Self = StObject.set(x, "getBreedList", js.Any.fromFunction2(value))
      
      inline def setGetPet(value: (Double, Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Unit): Self = StObject.set(x, "getPet", js.Any.fromFunction3(value))
      
      inline def setGetPetsInShelter(value: (String, Any, js.Function2[/* error */ Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = StObject.set(x, "getPetsInShelter", js.Any.fromFunction3(value))
      
      inline def setGetRandomPet(value: (Any, js.Function2[/* error */ Any, /* pet */ Pet, Unit]) => Unit): Self = StObject.set(x, "getRandomPet", js.Any.fromFunction2(value))
      
      inline def setGetShelter(value: (String, Any, js.Function2[/* error */ Any, /* shelter */ Shelter, Unit]) => Unit): Self = StObject.set(x, "getShelter", js.Any.fromFunction3(value))
      
      inline def setGetSheltersWithBreeds(
        value: (String, String, Any, js.Function2[/* error */ Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
      ): Self = StObject.set(x, "getSheltersWithBreeds", js.Any.fromFunction4(value))
    }
  }
  
  trait Shelter extends StObject {
    
    var address1: String
    
    var address2: String
    
    var city: String
    
    var country: String
    
    var email: String
    
    var fax: String
    
    var id: String
    
    var latitude: Double
    
    var longitude: Double
    
    var name: String
    
    var phone: String
    
    var state: String
    
    var zip: String
  }
  object Shelter {
    
    inline def apply(
      address1: String,
      address2: String,
      city: String,
      country: String,
      email: String,
      fax: String,
      id: String,
      latitude: Double,
      longitude: Double,
      name: String,
      phone: String,
      state: String,
      zip: String
    ): Shelter = {
      val __obj = js.Dynamic.literal(address1 = address1.asInstanceOf[js.Any], address2 = address2.asInstanceOf[js.Any], city = city.asInstanceOf[js.Any], country = country.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], fax = fax.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], latitude = latitude.asInstanceOf[js.Any], longitude = longitude.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phone = phone.asInstanceOf[js.Any], state = state.asInstanceOf[js.Any], zip = zip.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shelter]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Shelter] (val x: Self) extends AnyVal {
      
      inline def setAddress1(value: String): Self = StObject.set(x, "address1", value.asInstanceOf[js.Any])
      
      inline def setAddress2(value: String): Self = StObject.set(x, "address2", value.asInstanceOf[js.Any])
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry(value: String): Self = StObject.set(x, "country", value.asInstanceOf[js.Any])
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFax(value: String): Self = StObject.set(x, "fax", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLatitude(value: Double): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      inline def setLongitude(value: Double): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
      
      inline def setZip(value: String): Self = StObject.set(x, "zip", value.asInstanceOf[js.Any])
    }
  }
}
