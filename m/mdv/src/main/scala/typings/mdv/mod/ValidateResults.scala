package typings.mdv.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ValidateResults extends js.Object {
  
  var anchorsWithEmptyText: js.Array[Anchor] = js.native
  
  var anchorsWithHash: js.Array[Anchor] = js.native
  
  var duplicatedAnchors: js.Array[Anchor] = js.native
  
  var imagesWithMissingAlt: Double = js.native
  
  var localRefNoHash: js.Array[Anchor] = js.native
  
  var missingAnchors: js.Array[Anchor] = js.native
  
  var nonParsingExamples: js.Array[NonParsedEntry] = js.native
  
  var source: String = js.native
}
object ValidateResults {
  
  @scala.inline
  def apply(
    anchorsWithEmptyText: js.Array[Anchor],
    anchorsWithHash: js.Array[Anchor],
    duplicatedAnchors: js.Array[Anchor],
    imagesWithMissingAlt: Double,
    localRefNoHash: js.Array[Anchor],
    missingAnchors: js.Array[Anchor],
    nonParsingExamples: js.Array[NonParsedEntry],
    source: String
  ): ValidateResults = {
    val __obj = js.Dynamic.literal(anchorsWithEmptyText = anchorsWithEmptyText.asInstanceOf[js.Any], anchorsWithHash = anchorsWithHash.asInstanceOf[js.Any], duplicatedAnchors = duplicatedAnchors.asInstanceOf[js.Any], imagesWithMissingAlt = imagesWithMissingAlt.asInstanceOf[js.Any], localRefNoHash = localRefNoHash.asInstanceOf[js.Any], missingAnchors = missingAnchors.asInstanceOf[js.Any], nonParsingExamples = nonParsingExamples.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[ValidateResults]
  }
  
  @scala.inline
  implicit class ValidateResultsOps[Self <: ValidateResults] (val x: Self) extends AnyVal {
    
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
    def setAnchorsWithEmptyTextVarargs(value: Anchor*): Self = this.set("anchorsWithEmptyText", js.Array(value :_*))
    
    @scala.inline
    def setAnchorsWithEmptyText(value: js.Array[Anchor]): Self = this.set("anchorsWithEmptyText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnchorsWithHashVarargs(value: Anchor*): Self = this.set("anchorsWithHash", js.Array(value :_*))
    
    @scala.inline
    def setAnchorsWithHash(value: js.Array[Anchor]): Self = this.set("anchorsWithHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuplicatedAnchorsVarargs(value: Anchor*): Self = this.set("duplicatedAnchors", js.Array(value :_*))
    
    @scala.inline
    def setDuplicatedAnchors(value: js.Array[Anchor]): Self = this.set("duplicatedAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesWithMissingAlt(value: Double): Self = this.set("imagesWithMissingAlt", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocalRefNoHashVarargs(value: Anchor*): Self = this.set("localRefNoHash", js.Array(value :_*))
    
    @scala.inline
    def setLocalRefNoHash(value: js.Array[Anchor]): Self = this.set("localRefNoHash", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMissingAnchorsVarargs(value: Anchor*): Self = this.set("missingAnchors", js.Array(value :_*))
    
    @scala.inline
    def setMissingAnchors(value: js.Array[Anchor]): Self = this.set("missingAnchors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonParsingExamplesVarargs(value: NonParsedEntry*): Self = this.set("nonParsingExamples", js.Array(value :_*))
    
    @scala.inline
    def setNonParsingExamples(value: js.Array[NonParsedEntry]): Self = this.set("nonParsingExamples", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSource(value: String): Self = this.set("source", value.asInstanceOf[js.Any])
  }
}
