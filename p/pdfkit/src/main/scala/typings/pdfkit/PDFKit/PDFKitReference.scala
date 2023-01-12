package typings.pdfkit.PDFKit

import typings.pdfkit.anon.Annots
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** PDFReference - represents a reference to another object in the PDF object heirarchy */
trait PDFKitReference extends StObject {
  
  var chunks: js.Array[Any]
  
  var compress: Boolean
  
  var data: Annots
  
  var deflate: Any
  
  var document: PDFDocument
  
  def end(chunk: Any): Unit
  
  var gen: Double
  
  var id: Double
  
  def initDeflate(): Unit
  
  var uncompressedLength: Double
  
  def write(chunk: Any): Unit
}
object PDFKitReference {
  
  inline def apply(
    chunks: js.Array[Any],
    compress: Boolean,
    data: Annots,
    deflate: Any,
    document: PDFDocument,
    end: Any => Unit,
    gen: Double,
    id: Double,
    initDeflate: () => Unit,
    uncompressedLength: Double,
    write: Any => Unit
  ): PDFKitReference = {
    val __obj = js.Dynamic.literal(chunks = chunks.asInstanceOf[js.Any], compress = compress.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], deflate = deflate.asInstanceOf[js.Any], document = document.asInstanceOf[js.Any], end = js.Any.fromFunction1(end), gen = gen.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], initDeflate = js.Any.fromFunction0(initDeflate), uncompressedLength = uncompressedLength.asInstanceOf[js.Any], write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[PDFKitReference]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PDFKitReference] (val x: Self) extends AnyVal {
    
    inline def setChunks(value: js.Array[Any]): Self = StObject.set(x, "chunks", value.asInstanceOf[js.Any])
    
    inline def setChunksVarargs(value: Any*): Self = StObject.set(x, "chunks", js.Array(value*))
    
    inline def setCompress(value: Boolean): Self = StObject.set(x, "compress", value.asInstanceOf[js.Any])
    
    inline def setData(value: Annots): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setDeflate(value: Any): Self = StObject.set(x, "deflate", value.asInstanceOf[js.Any])
    
    inline def setDocument(value: PDFDocument): Self = StObject.set(x, "document", value.asInstanceOf[js.Any])
    
    inline def setEnd(value: Any => Unit): Self = StObject.set(x, "end", js.Any.fromFunction1(value))
    
    inline def setGen(value: Double): Self = StObject.set(x, "gen", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setInitDeflate(value: () => Unit): Self = StObject.set(x, "initDeflate", js.Any.fromFunction0(value))
    
    inline def setUncompressedLength(value: Double): Self = StObject.set(x, "uncompressedLength", value.asInstanceOf[js.Any])
    
    inline def setWrite(value: Any => Unit): Self = StObject.set(x, "write", js.Any.fromFunction1(value))
  }
}
