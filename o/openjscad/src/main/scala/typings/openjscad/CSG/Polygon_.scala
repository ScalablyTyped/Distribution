package typings.openjscad.CSG

import typings.openjscad.CAG
import typings.openjscad.CSG.Polygon.Shared
import typings.openjscad.CxG
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Polygon_ extends CxG {
  
  /**
    *
    * @param walls Array of wall polygons
    * @param bottom Bottom polygon
    * @param top Top polygon
    */
  /* private */ def _addWalls(walls: js.Any, bottom: js.Any, top: js.Any, bFlipped: js.Any): js.Any = js.native
  
  def boundingBox(): js.Array[Vector3D] = js.native
  
  def boundingSphere(): js.Any = js.native
  
  var cachedBoundingBox: js.Array[Vector3D] = js.native
  
  var cachedBoundingSphere: js.Any = js.native
  
  def checkIfConvex(): Unit = js.native
  
  def extrude(offsetvector: js.Any): typings.openjscad.CSG = js.native
  
  def flipped(): Polygon = js.native
  
  def getArea(): Double = js.native
  
  def getSignedVolume(): Double = js.native
  
  def getTetraFeatures(features: js.Any): js.Array[_] = js.native
  
  var plane: Plane = js.native
  
  def projectToOrthoNormalBasis(orthobasis: OrthoNormalBasis): CAG = js.native
  
  def setColor(args: js.Any): Polygon = js.native
  
  var shared: Shared = js.native
  
  /**
    * Creates solid from slices (CSG.Polygon) by generating walls
    * @param {Object} options Solid generating options
    *  - numslices {Number} Number of slices to be generated
    *  - callback(t, slice) {Function} Callback function generating slices.
    *          arguments: t = [0..1], slice = [0..numslices - 1]
    *          return: CSG.Polygon or null to skip
    *  - loop {Boolean} no flats, only walls, it's used to generate solids like a tor
    */
  def solidFromSlices(options: js.Any): typings.openjscad.CSG = js.native
  
  var vertices: js.Array[Vertex] = js.native
}
