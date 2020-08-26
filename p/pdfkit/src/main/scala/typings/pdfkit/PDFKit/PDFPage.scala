package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Bottom
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represent a single page in the PDF document
  */
@js.native
trait PDFPage extends js.Object {
  var annotations: js.Any = js.native
  var content: PDFKitReference = js.native
  /**
    * The page dictionnary
    */
  var dictionary: PDFKitReference = js.native
  var document: PDFDocument = js.native
  var ext_gstates: js.Any = js.native
  var fonts: js.Any = js.native
  var height: Double = js.native
  var layout: String = js.native
  var margins: Bottom = js.native
  var patterns: js.Any = js.native
  var size: String = js.native
  var width: Double = js.native
  var xobjects: js.Any = js.native
  def end(): Unit = js.native
  def maxY(): Double = js.native
  def write(chunk: js.Any): Unit = js.native
}

object PDFPage {
  @scala.inline
  def apply(
    annotations: js.Any,
    content: PDFKitReference,
    dictionary: PDFKitReference,
    document: PDFDocument,
    end: () => Unit,
    ext_gstates: js.Any,
    fonts: js.Any,
    height: Double,
    layout: String,
    margins: Bottom,
    maxY: () => Double,
    patterns: js.Any,
    size: String,
    width: Double,
    write: js.Any => Unit,
    xobjects: js.Any
  ): PDFPage = {
    val __obj = js.Dynamic.literal(annotations = annotations.asInstanceOf[js.Any], content = content.asInstanceOf[js.Any], dictionary = dictionary.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction0(end), ext_gstates = ext_gstates.asInstanceOf[js.Any], fonts = fonts.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], layout = layout.asInstanceOf[js.Any], margins = margins.asInstanceOf[js.Any], maxY = js.Any.fromFunction0(maxY), patterns = patterns.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any], write = js.Any.fromFunction1(write), xobjects = xobjects.asInstanceOf[js.Any])
    __obj.asInstanceOf[PDFPage]
  }
  @scala.inline
  implicit class PDFPageOps[Self <: PDFPage] (val x: Self) extends AnyVal {
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
    def setAnnotations(value: js.Any): Self = this.set("annotations", value.asInstanceOf[js.Any])
    @scala.inline
    def setContent(value: PDFKitReference): Self = this.set("content", value.asInstanceOf[js.Any])
    @scala.inline
    def setDictionary(value: PDFKitReference): Self = this.set("dictionary", value.asInstanceOf[js.Any])
    @scala.inline
    def setDocument(value: PDFDocument): Self = this.set("document", value.asInstanceOf[js.Any])
    @scala.inline
    def setEnd(value: () => Unit): Self = this.set("end", js.Any.fromFunction0(value))
    @scala.inline
    def setExt_gstates(value: js.Any): Self = this.set("ext_gstates", value.asInstanceOf[js.Any])
    @scala.inline
    def setFonts(value: js.Any): Self = this.set("fonts", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setLayout(value: String): Self = this.set("layout", value.asInstanceOf[js.Any])
    @scala.inline
    def setMargins(value: Bottom): Self = this.set("margins", value.asInstanceOf[js.Any])
    @scala.inline
    def setMaxY(value: () => Double): Self = this.set("maxY", js.Any.fromFunction0(value))
    @scala.inline
    def setPatterns(value: js.Any): Self = this.set("patterns", value.asInstanceOf[js.Any])
    @scala.inline
    def setSize(value: String): Self = this.set("size", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
    @scala.inline
    def setWrite(value: js.Any => Unit): Self = this.set("write", js.Any.fromFunction1(value))
    @scala.inline
    def setXobjects(value: js.Any): Self = this.set("xobjects", value.asInstanceOf[js.Any])
  }
  
}

