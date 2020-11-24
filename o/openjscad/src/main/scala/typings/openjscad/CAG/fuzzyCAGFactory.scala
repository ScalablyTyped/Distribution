package typings.openjscad.CAG

import typings.openjscad.CSG.fuzzyFactory
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait fuzzyCAGFactory extends js.Object {
  
  def getCAG(sourcecag: typings.openjscad.CAG): typings.openjscad.CAG = js.native
  
  def getSide(sourceside: Side): Side = js.native
  
  def getVertex(sourcevertex: Vertex): Vertex = js.native
  
  var vertexfactory: fuzzyFactory = js.native
}
object fuzzyCAGFactory {
  
  @scala.inline
  def apply(
    getCAG: typings.openjscad.CAG => typings.openjscad.CAG,
    getSide: Side => Side,
    getVertex: Vertex => Vertex,
    vertexfactory: fuzzyFactory
  ): fuzzyCAGFactory = {
    val __obj = js.Dynamic.literal(getCAG = js.Any.fromFunction1(getCAG), getSide = js.Any.fromFunction1(getSide), getVertex = js.Any.fromFunction1(getVertex), vertexfactory = vertexfactory.asInstanceOf[js.Any])
    __obj.asInstanceOf[fuzzyCAGFactory]
  }
  
  @scala.inline
  implicit class fuzzyCAGFactoryOps[Self <: fuzzyCAGFactory] (val x: Self) extends AnyVal {
    
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
    def setGetCAG(value: typings.openjscad.CAG => typings.openjscad.CAG): Self = this.set("getCAG", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSide(value: Side => Side): Self = this.set("getSide", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetVertex(value: Vertex => Vertex): Self = this.set("getVertex", js.Any.fromFunction1(value))
    
    @scala.inline
    def setVertexfactory(value: fuzzyFactory): Self = this.set("vertexfactory", value.asInstanceOf[js.Any])
  }
}
