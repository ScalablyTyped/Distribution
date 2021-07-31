package typings.nodeSqlParser.typesMod

import typings.nodeSqlParser.nodeSqlParserStrings.Asterisk
import typings.nodeSqlParser.nodeSqlParserStrings.star
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Star extends StObject {
  
  var `type`: star
  
  var value: Asterisk
}
object Star {
  
  @scala.inline
  def apply(): Star = {
    val __obj = js.Dynamic.literal(value = "*")
    __obj.updateDynamic("type")("star")
    __obj.asInstanceOf[Star]
  }
  
  @scala.inline
  implicit class StarMutableBuilder[Self <: Star] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: star): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValue(value: Asterisk): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
  }
}
