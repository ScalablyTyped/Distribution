package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import typings.pdfjsDist.anon.OwnerDocument
import typings.pdfjsDist.typesSrcDisplayApiMod.^
import typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.DOMCMapReaderFactory
import typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.DOMCanvasFactory
import typings.pdfjsDist.typesSrcDisplayDisplayUtilsMod.DOMStandardFontDataFactory
import typings.std.URL
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def DefaultCMapReaderFactory_=(x: Instantiable0[DOMCMapReaderFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCMapReaderFactory")(x.asInstanceOf[js.Any])

inline def DefaultCanvasFactory_=(x: Instantiable1[/* hasOwnerDocument */ js.UndefOr[OwnerDocument], DOMCanvasFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultCanvasFactory")(x.asInstanceOf[js.Any])

inline def DefaultStandardFontDataFactory_=(x: Instantiable0[DOMStandardFontDataFactory]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("DefaultStandardFontDataFactory")(x.asInstanceOf[js.Any])

inline def build: String = ^.asInstanceOf[js.Dynamic].selectDynamic("build").asInstanceOf[String]

inline def getDocument(src: GetDocumentParameters): PDFDocumentLoadingTask = ^.asInstanceOf[js.Dynamic].applyDynamic("getDocument")(src.asInstanceOf[js.Any]).asInstanceOf[PDFDocumentLoadingTask]

inline def setPDFNetworkStreamFactory(pdfNetworkStreamFactory: IPDFStreamFactory): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("setPDFNetworkStreamFactory")(pdfNetworkStreamFactory.asInstanceOf[js.Any]).asInstanceOf[Unit]

inline def version: String = ^.asInstanceOf[js.Dynamic].selectDynamic("version").asInstanceOf[String]

type BinaryData = TypedArray | js.typedarray.ArrayBuffer | js.Array[Double] | String

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typings.std.URL
  - typings.pdfjsDist.typesSrcDisplayApiMod.TypedArray
  - js.typedarray.ArrayBuffer
  - typings.pdfjsDist.typesSrcDisplayApiMod.PDFDataRangeTransport
  - typings.pdfjsDist.typesSrcDisplayApiMod.DocumentInitParameters
*/
type GetDocumentParameters = _GetDocumentParameters | String | URL | TypedArray | js.typedarray.ArrayBuffer

type IPDFStreamFactory = js.Function

type TypedArray = js.typedarray.Int8Array | js.typedarray.Uint8Array | js.typedarray.Uint8ClampedArray | js.typedarray.Int16Array | js.typedarray.Uint16Array | js.typedarray.Int32Array | js.typedarray.Uint32Array | js.typedarray.Float32Array | js.typedarray.Float64Array
