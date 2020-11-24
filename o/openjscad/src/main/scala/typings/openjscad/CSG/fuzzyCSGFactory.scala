package typings.openjscad.CSG

import typings.openjscad.CSG.Polygon.Shared
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fuzzyCSGFactory extends js.Object {
  
  def getCSG(sourcecsg: typings.openjscad.CSG): typings.openjscad.CSG = js.native
  
  def getPlane(sourceplane: Plane): Plane = js.native
  
  def getPolygon(sourcepolygon: Polygon): Polygon = js.native
  
  def getPolygonShared(sourceshared: Shared): Shared = js.native
  
  def getVertex(sourcevertex: Vertex): Vertex = js.native
  
  var planefactory: fuzzyFactory = js.native
  
  var polygonsharedfactory: js.Any = js.native
  
  var vertexfactory: fuzzyFactory = js.native
}
object fuzzyCSGFactory {
  
  @scala.inline
  def apply(
    getCSG: typings.openjscad.CSG => typings.openjscad.CSG,
    getPlane: Plane => Plane,
    getPolygon: Polygon => Polygon,
    getPolygonShared: Shared => Shared,
    getVertex: Vertex => Vertex,
    planefactory: fuzzyFactory,
    polygonsharedfactory: js.Any,
    vertexfactory: fuzzyFactory
  ): fuzzyCSGFactory = {
    val __obj = js.Dynamic.literal(getCSG = js.Any.fromFunction1(getCSG), getPlane = js.Any.fromFunction1(getPlane), getPolygon = js.Any.fromFunction1(getPolygon), getPolygonShared = js.Any.fromFunction1(getPolygonShared), getVertex = js.Any.fromFunction1(getVertex), planefactory = planefactory.asInstanceOf[js.Any], polygonsharedfactory = polygonsharedfactory.asInstanceOf[js.Any], vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCSGFactory]
  }
  
  @scala.inline
  implicit class fuzzyCSGFactoryOps[Self <: fuzzyCSGFactory] (val x: Self) extends AnyVal {
    
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
    def setGetCSG(value: typings.openjscad.CSG => typings.openjscad.CSG): Self = this.set("getCSG", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPlane(value: Plane => Plane): Self = this.set("getPlane", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPolygon(value: Polygon => Polygon): Self = this.set("getPolygon", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetPolygonShared(value: Shared => Shared): Self = this.set("getPolygonShared", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertex(value: Vertex => Vertex): Self = this.set("getVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setPlanefactory(value: fuzzyFactory): Self = this.set("planefactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPolygonsharedfactory(value: js.Any): Self = this.set("polygonsharedfactory", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVertexfactory(value: fuzzyFactory): Self = this.set("vertexfactory", value.asInstanceOf[js.Any])
  }
}
