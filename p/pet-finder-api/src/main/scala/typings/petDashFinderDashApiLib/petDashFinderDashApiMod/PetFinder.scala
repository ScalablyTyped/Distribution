package typings
package petDashFinderDashApiLib.petDashFinderDashApiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PetFinder extends js.Object {
  def findPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], scala.Unit]): scala.Unit
  def findShelter(
    location: java.lang.String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], scala.Unit]
  ): scala.Unit
  def getBreedList(
    animal: java.lang.String,
    callback: js.Function2[/* err */ js.Any, /* breedArray */ js.Array[java.lang.String], scala.Unit]
  ): scala.Unit
  def getPet(
    petId: scala.Double,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* pet */ Pet, scala.Unit]
  ): scala.Unit
  def getPetsInShelter(
    shelterId: java.lang.String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], scala.Unit]
  ): scala.Unit
  def getRandomPet(options: js.Any, callback: js.Function2[/* error */ js.Any, /* pet */ Pet, scala.Unit]): scala.Unit
  def getShelter(
    shelterId: java.lang.String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelter */ Shelter, scala.Unit]
  ): scala.Unit
  def getSheltersWithBreeds(
    animal: java.lang.String,
    breed: java.lang.String,
    options: js.Any,
    callback: js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], scala.Unit]
  ): scala.Unit
}

object PetFinder {
  @scala.inline
  def apply(
    findPet: (js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], scala.Unit]) => scala.Unit,
    findShelter: (java.lang.String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], scala.Unit]) => scala.Unit,
    getBreedList: (java.lang.String, js.Function2[/* err */ js.Any, /* breedArray */ js.Array[java.lang.String], scala.Unit]) => scala.Unit,
    getPet: (scala.Double, js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, scala.Unit]) => scala.Unit,
    getPetsInShelter: (java.lang.String, js.Any, js.Function2[/* error */ js.Any, /* pets */ js.Array[Pet], scala.Unit]) => scala.Unit,
    getRandomPet: (js.Any, js.Function2[/* error */ js.Any, /* pet */ Pet, scala.Unit]) => scala.Unit,
    getShelter: (java.lang.String, js.Any, js.Function2[/* error */ js.Any, /* shelter */ Shelter, scala.Unit]) => scala.Unit,
    getSheltersWithBreeds: (java.lang.String, java.lang.String, js.Any, js.Function2[/* error */ js.Any, /* shelters */ js.Array[Shelter], scala.Unit]) => scala.Unit
  ): PetFinder = {
    val __obj = js.Dynamic.literal(findPet = js.Any.fromFunction2(findPet), findShelter = js.Any.fromFunction3(findShelter), getBreedList = js.Any.fromFunction2(getBreedList), getPet = js.Any.fromFunction3(getPet), getPetsInShelter = js.Any.fromFunction3(getPetsInShelter), getRandomPet = js.Any.fromFunction2(getRandomPet), getShelter = js.Any.fromFunction3(getShelter), getSheltersWithBreeds = js.Any.fromFunction4(getSheltersWithBreeds))
  
    __obj.asInstanceOf[PetFinder]
  }
}

