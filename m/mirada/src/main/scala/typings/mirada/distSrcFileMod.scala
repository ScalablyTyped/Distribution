package typings.mirada

import typings.fileType.coreMod.FileTypeResult
import typings.mirada.anon.Height
import typings.mirada.anon.RequestInitnamestringunde
import typings.mirada.distSrcTypesOpencvMod.Mat
import typings.std.HTMLElement
import typings.std.HTMLInputElement
import typings.std.ImageData
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcFileMod {
  
  @JSImport("mirada/dist/src/file", "File")
  @js.native
  open class File protected () extends StObject {
    def this(name: String, _mat: Mat) = this()
    
    /* protected */ var _mat: Mat = js.native
    
    /**
      * Returns an array buffer containing the image encoded in given format or inferring format from its name.
      */
    def asArrayBuffer(): js.Promise[js.typedarray.ArrayBuffer] = js.native
    def asArrayBuffer(format: String): js.Promise[js.typedarray.ArrayBuffer] = js.native
    
    def asBase64(): js.Promise[String] = js.native
    def asBase64(format: String): js.Promise[String] = js.native
    
    def asDataUrl(): String = js.native
    
    def asHTMLImageData(): ImageData = js.native
    
    def asImageData(): typings.mirada.distSrcTypesOpencvMod.ImageData = js.native
    
    def asMat(): Mat = js.native
    
    def clone(name: String): File = js.native
    
    def delete(): Unit = js.native
    
    def getExtension(): String = js.native
    
    def getMimeType(): js.UndefOr[String] = js.native
    
    val height: Double = js.native
    
    val mat: Mat = js.native
    
    val name: String = js.native
    
    /**
      * It removes the the file from file system and also delete() this file's Mat
      */
    def remove(): this.type = js.native
    def remove(deleteMat: Boolean): this.type = js.native
    
    def setMat(mat: Mat): this.type = js.native
    
    /**
      * Shows this image in given HTML canvas or image element.
      */
    def show(el: HTMLElement): this.type = js.native
    
    def size(): Height = js.native
    
    /**
      * Converts the Mat of this file to RGBA channel type. It will replace the current mat and delete the original.
      */
    def toRgba(): this.type = js.native
    
    val width: Double = js.native
    
    /**
      * Writes this image on given file path, encoded in given format (or inferred form current name).
      */
    def write(): js.Promise[this.type] = js.native
    def write(path: String): js.Promise[this.type] = js.native
    def write(path: String, format: String): js.Promise[this.type] = js.native
    def write(path: Unit, format: String): js.Promise[this.type] = js.native
  }
  /* static members */
  object File {
    
    @JSImport("mirada/dist/src/file", "File")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("mirada/dist/src/file", "File._buildName")
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
    
    inline def fromMat(mat: Mat): File = ^.asInstanceOf[js.Dynamic].applyDynamic("fromMat")(mat.asInstanceOf[js.Any]).asInstanceOf[File]
    inline def fromMat(mat: Mat, name: String): File = (^.asInstanceOf[js.Dynamic].applyDynamic("fromMat")(mat.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[File]
    
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
}
