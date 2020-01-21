package typings.petFinderApi.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PetFinder extends js.Object {
  def findPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]): Unit
  def findShelter(
    location: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit
  def getBreedList(animal: String, callback: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[String], Unit]): Unit
  def getPet(petId: Double, options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit
  def getPetsInShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], Unit]
  ): Unit
  def getRandomPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, Unit]): Unit
  def getShelter(
    shelterId: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelter */ Shelter, Unit]
  ): Unit
  def getSheltersWithBreeds(
    animal: String,
    breed: String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], Unit]
  ): Unit
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
}

