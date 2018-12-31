package typings
package petDashFinderDashApiLib.petDashFinderDashApiMod.petFinderNs

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

