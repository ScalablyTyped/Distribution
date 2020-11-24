package typings.petFinderApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PetFinder extends js.Object {
  
  def findPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]): Unit = js.native
  
  def findShelter(
    location: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit = js.native
  
  def getBreedList(animal: String, callback: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]): Unit = js.native
  
  def getPet(petId: Double, options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit = js.native
  
  def getPetsInShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]
  ): Unit = js.native
  
  def getRandomPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit = js.native
  
  def getShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]
  ): Unit = js.native
  
  def getSheltersWithBreeds(
    animal: String,
    breed: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit = js.native
}
object PetFinder {
  
  @scala.inline
  def apply(
    findPet: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit,
    findShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit,
    getBreedList: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Unit,
    getPet: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit,
    getPetsInShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit,
    getRandomPet: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit,
    getShelter: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Unit,
    getSheltersWithBreeds: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
  ): PetFinder = {
    val __obj = js.Dynamic.literal(findPet = js.Any.fromFunction2(findPet), findShelter = js.Any.fromFunction3(findShelter), getBreedList = js.Any.fromFunction2(getBreedList), getPet = js.Any.fromFunction3(getPet), getPetsInShelter = js.Any.fromFunction3(getPetsInShelter), getRandomPet = js.Any.fromFunction2(getRandomPet), getShelter = js.Any.fromFunction3(getShelter), getSheltersWithBreeds = js.Any.fromFunction4(getSheltersWithBreeds))
    __obj.asInstanceOf[PetFinder]
  }
  
  @scala.inline
  implicit class PetFinderOps[Self <: PetFinder] (val x: Self) extends AnyVal {
    
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
    def setFindPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = this.set("findPet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setFindShelter(
      value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): Self = this.set("findShelter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetBreedList(value: (String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]) => Unit): Self = this.set("getBreedList", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetPet(value: (Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = this.set("getPet", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetPetsInShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]) => Unit): Self = this.set("getPetsInShelter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetRandomPet(value: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]) => Unit): Self = this.set("getRandomPet", js.Any.fromFunction2(value))
    
    @scala.inline
    def setGetShelter(value: (String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]) => Unit): Self = this.set("getShelter", js.Any.fromFunction3(value))
    
    @scala.inline
    def setGetSheltersWithBreeds(
      value: (String, String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]) => Unit
    ): Self = this.set("getSheltersWithBreeds", js.Any.fromFunction4(value))
  }
}
