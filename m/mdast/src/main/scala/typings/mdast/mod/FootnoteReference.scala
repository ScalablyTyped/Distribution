package typings.mdast.mod

import typings.mdast.mdastStrings.footnoteReference
import typings.unist.mod.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FootnoteReference
  extends StObject
     with Node
     with Association
     with StaticPhrasingContent {
  
  @JSName("type")
  var type_FootnoteReference: footnoteReference
}
object FootnoteReference {
  
  @scala.inline
  def apply(identifier: String): FootnoteReference = {
    val __obj = js.Dynamic.literal(identifier = identifier.asInstanceOf[js.Any])
    __obj.updateDynamic("type")("footnoteReference")
    __obj.asInstanceOf[FootnoteReference]
  }
  
  @scala.inline
  implicit class FootnoteReferenceMutableBuilder[Self <: FootnoteReference] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: footnoteReference): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
