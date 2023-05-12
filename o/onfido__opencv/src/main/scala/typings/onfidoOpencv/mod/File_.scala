package typings.onfidoOpencv.mod

import typings.fileType.coreMod.FileTypeResult
import typings.mirada.anon.RequestInitnamestringunde
import typings.mirada.distSrcFileMod.File
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@onfido/opencv", "File")
@js.native
open class File_ protected ()
  extends typings.mirada.mod.File_ {
  def this(name: String, _mat: typings.mirada.distSrcTypesOpencvMod.Mat) = this()
}
/* static members */
object File_ {
  
  @JSImport("@onfido/opencv", "File")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@onfido/opencv", "File._buildName")
  @js.native
  def _buildName: Any = js.native
  inline def _buildName_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("_buildName")(x.asInstanceOf[js.Any])
  
  inline def asPath(f: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asPath")(f.asInstanceOf[js.Any]).asInstanceOf[String]
  inline def asPath(f: File): String = ^.asInstanceOf[js.Dynamic].applyDynamic("asPath")(f.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def fileType(a: js.typedarray.ArrayBuffer): js.UndefOr[FileTypeResult] = ^.asInstanceOf[js.Dynamic].applyDynamic("fileType")(a.asInstanceOf[js.Any]).asInstanceOf[js.UndefOr[FileTypeResult]]
  
  /**
    * Loads file from given array buffer containing an encoded image.
    */
  inline def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromArrayBuffer(buffer: js.typedarray.ArrayBuffer, name: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBuffer")(buffer.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  /**
    * Loads file from given array buffer view containing an encoded image.
    */
  inline def fromArrayBufferView(a: js.typedarray.ArrayBufferView): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBufferView")(a.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromArrayBufferView(a: js.typedarray.ArrayBufferView, name: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromArrayBufferView")(a.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  /**
    * Loads file from given base64 string containing an encoded image.
    */
  inline def fromBase64(base64: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromBase64(base64: String, name: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromBase64")(base64.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  inline def fromCanvas(el: String): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvas")(el.asInstanceOf[js.Any]).asInstanceOf[File]
  /**
    * Loads file form existing HTMLElement or HTMLImageElement
    */
  inline def fromCanvas(el: HTMLElement): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromCanvas")(el.asInstanceOf[js.Any]).asInstanceOf[File]
  
  inline def fromData(data: typings.mirada.distSrcTypesOpencvMod.ImageData): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any]).asInstanceOf[File]
  inline def fromData(data: typings.mirada.distSrcTypesOpencvMod.ImageData, name: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fromData")(data.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[File]
  
  /**
    * Loads file from given data url string containing an encoded image.
    */
  inline def fromDataUrl(dataUrl: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromDataUrl")(dataUrl.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromDataUrl(dataUrl: String, name: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromDataUrl")(dataUrl.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  inline def fromFile(path: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromFile(path: String, name: String): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromFile")(path.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  /**
    * Loads files from files in html input element of type "file".
    */
  inline def fromHtmlFileInputElement(el: HTMLInputElement): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromHtmlFileInputElement")(el.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  
  inline def fromMat(mat: typings.mirada.distSrcTypesOpencvMod.Mat): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMat")(mat.asInstanceOf[js.Any]).asInstanceOf[File]
  inline def fromMat(mat: typings.mirada.distSrcTypesOpencvMod.Mat, name: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat")(mat.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[File]
  
  inline def fromUrl(url: String): js.Promise[File] = ^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any]).asInstanceOf[js.Promise[File]]
  inline def fromUrl(url: String, o: RequestInitnamestringunde): js.Promise[File] = (^.asInstanceOf[js.Dynamic].applyDynamic("fromUrl")(url.asInstanceOf[js.Any], o.asInstanceOf[js.Any])).asInstanceOf[js.Promise[File]]
  
  inline def getBufferFileName(a: js.typedarray.ArrayBuffer): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getBufferFileName")(a.asInstanceOf[js.Any]).asInstanceOf[String]
  
  inline def getBufferFileType(a: js.typedarray.ArrayBuffer): FileTypeResult = ^.asInstanceOf[js.Dynamic].applyDynamic("getBufferFileType")(a.asInstanceOf[js.Any]).asInstanceOf[FileTypeResult]
  
  inline def isFile(f: Any): /* is mirada.mirada/dist/src/file.File */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFile")(f.asInstanceOf[js.Any]).asInstanceOf[/* is mirada.mirada/dist/src/file.File */ Boolean]
  
  /**
    * Given paths, urls or files it will try to load them all and return a list of File for those succeed.
    */
  inline def resolve(): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")().asInstanceOf[js.Promise[js.Array[File]]]
  inline def resolve(files: String): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  inline def resolve(files: js.Array[js.UndefOr[String | File]]): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  inline def resolve(files: File): js.Promise[js.Array[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Array[File]]]
  
  /**
    * Shortcut for [resolve] that returns the first result.
    */
  inline def resolveOne(): js.Promise[js.UndefOr[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveOne")().asInstanceOf[js.Promise[js.UndefOr[File]]]
  inline def resolveOne(files: String): js.Promise[js.UndefOr[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveOne")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[File]]]
  inline def resolveOne(files: js.Array[js.UndefOr[String | File]]): js.Promise[js.UndefOr[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveOne")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[File]]]
  inline def resolveOne(files: File): js.Promise[js.UndefOr[File]] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolveOne")(files.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.UndefOr[File]]]
}
