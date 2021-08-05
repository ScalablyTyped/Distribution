package typings.pizzip

import typings.node.Buffer
import typings.node.processMod.global.NodeJS.Platform
import typings.pizzip.mod.Compression
import typings.pizzip.pizzipNumbers.`1`
import typings.pizzip.pizzipNumbers.`2`
import typings.pizzip.pizzipNumbers.`3`
import typings.pizzip.pizzipNumbers.`4`
import typings.pizzip.pizzipNumbers.`5`
import typings.pizzip.pizzipNumbers.`6`
import typings.pizzip.pizzipNumbers.`7`
import typings.pizzip.pizzipNumbers.`8`
import typings.pizzip.pizzipNumbers.`9`
import typings.pizzip.pizzipStrings.DOS
import typings.pizzip.pizzipStrings.UNIX
import typings.pizzip.pizzipStrings.arraybuffer
import typings.pizzip.pizzipStrings.base64
import typings.pizzip.pizzipStrings.blob
import typings.pizzip.pizzipStrings.nodebuffer
import typings.pizzip.pizzipStrings.string
import typings.pizzip.pizzipStrings.uint8array
import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Base64 extends StObject {
    
    /**
      * @deprecated
      */
    var base64: Boolean
    
    /**
      * @deprecated
      */
    var binary: Boolean
    
    var compression: Compression
    
    /**
      * @deprecated use File.date
      */
    var date: Date
    
    /**
      * @deprecated use File.dir
      */
    var dir: Boolean
  }
  object Base64 {
    
    inline def apply(base64: Boolean, binary: Boolean, compression: Compression, date: Date, dir: Boolean): Base64 = {
      val __obj = js.Dynamic.literal(base64 = base64.asInstanceOf[js.Any], binary = binary.asInstanceOf[js.Any], compression = compression.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
      __obj.asInstanceOf[Base64]
    }
    
    extension [Self <: Base64](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBinary(value: Boolean): Self = StObject.set(x, "binary", value.asInstanceOf[js.Any])
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setDate(value: Date): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
      
      inline def setDir(value: Boolean): Self = StObject.set(x, "dir", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'arraybuffer'} */
  trait GenerateOptionstypearrayb extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & arraybuffer
  }
  object GenerateOptionstypearrayb {
    
    inline def apply(`type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & arraybuffer): GenerateOptionstypearrayb = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypearrayb]
    }
    
    extension [Self <: GenerateOptionstypearrayb](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & arraybuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'blob'} */
  trait GenerateOptionstypeblob extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & blob
  }
  object GenerateOptionstypeblob {
    
    inline def apply(`type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & blob): GenerateOptionstypeblob = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypeblob]
    }
    
    extension [Self <: GenerateOptionstypeblob](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & blob): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'nodebuffer'} */
  trait GenerateOptionstypenodebu extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & nodebuffer
  }
  object GenerateOptionstypenodebu {
    
    inline def apply(`type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & nodebuffer): GenerateOptionstypenodebu = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypenodebu]
    }
    
    extension [Self <: GenerateOptionstypenodebu](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & nodebuffer): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'string' | 'base64' | undefined} */
  trait GenerateOptionstypestring extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & (js.UndefOr[string | base64])
  }
  object GenerateOptionstypestring {
    
    inline def apply(
      `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & (js.UndefOr[string | base64])
    ): GenerateOptionstypestring = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypestring]
    }
    
    extension [Self <: GenerateOptionstypestring](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(
        value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & (js.UndefOr[string | base64])
      ): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined pizzip.pizzip.GenerateOptions & {  type :'uint8array'} */
  trait GenerateOptionstypeuint8a extends StObject {
    
    /**
      * @deprecated use `type` instead. If `type` is not used, set to `false` to get the result as a raw byte string, `true` to encode it as base64.
      * @default false
      */
    var base64: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The comment to use for the zip file.
      */
    var comment: js.UndefOr[String] = js.undefined
    
    /**
      * the default file compression method to use. Available methods are `STORE` and `DEFLATE`. You can also provide your own compression method.
      * @default "STORE"
      */
    var compression: js.UndefOr[Compression] = js.undefined
    
    /**
      * the options to use when compressing the file. With `STORE` (no compression), this parameter is ignored.
      * With `DEFLATE`, you can give the compression level with `compressionOptions : {level:6}`
      * (or any level between 1 (best speed) and 9 (best compression)).
      *
      * Note : if the entry is already compressed (coming from a compressed zip file),
      * calling `generate()` with a different compression level won't update the entry.
      * The reason is simple : PizZip doesn't know how compressed the content was and how to match the compression level with the implementation we use.
      */
    var compressionOptions: js.UndefOr[Level | Null] = js.undefined
    
    /**
      * the function to encode the file name / comment.
      * By default, PizZip uses UTF-8 to encode the file names / comments. You can use this method to force an other encoding.
      * Note : the encoding used is not stored in a zip file, not using UTF-8 may lead to encoding issues.
      * The function takes a string and returns a bytes array (Uint8Array or Array).
      */
    var encodeFileName: js.UndefOr[js.Function1[/* name */ String, Buffer]] = js.undefined
    
    /**
      * mime-type for the generated file. Useful when you need to generate a file with a different extension, ie: ".ods".
      *
      * @default "application/zip"
      */
    var mimeType: js.UndefOr[String] = js.undefined
    
    /**
      * The platform to use when generating the zip file. When using `DOS`, the attribute `dosPermissions` of each file is used.
      * When using `UNIX`, the attribute `unixPermissions` of each file is used.
      * If you set the platform value on nodejs, be sure to use `process.platform`.
      * `fs.stats` returns a non executable mode for folders on windows,
      * if you force the platform to `UNIX` the generated zip file will have a strange behavior on UNIX platforms.
      * @default "DOS"
      */
    var platform: js.UndefOr[DOS | UNIX | Platform] = js.undefined
    
    /**
      * The type of zip to return. Note : when using type = "uint8array", "arraybuffer" or "blob",
      * be sure to check if the browser supports it (you can use PizZip.support)
      *
      * `base64` : the result will be a string, the binary in a base64 form.
      *
      * `string` : the result will be a string in "binary" form, using 1 byte per char (2 bytes).
      *
      * `uint8array` : the result will be a Uint8Array containing the zip. This requires a compatible browser.
      *
      * `arraybuffer` : the result will be a ArrayBuffer containing the zip. This requires a compatible browser.
      *
      * `blob` : the result will be a Blob containing the zip. This requires a compatible browser.
      *
      * `nodebuffer` : the result will be a nodejs Buffer containing the zip. This requires nodejs.
      *
      * @default "base64"
      */
    var `type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & uint8array
  }
  object GenerateOptionstypeuint8a {
    
    inline def apply(`type`: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & uint8array): GenerateOptionstypeuint8a = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[GenerateOptionstypeuint8a]
    }
    
    extension [Self <: GenerateOptionstypeuint8a](x: Self) {
      
      inline def setBase64(value: Boolean): Self = StObject.set(x, "base64", value.asInstanceOf[js.Any])
      
      inline def setBase64Undefined: Self = StObject.set(x, "base64", js.undefined)
      
      inline def setComment(value: String): Self = StObject.set(x, "comment", value.asInstanceOf[js.Any])
      
      inline def setCommentUndefined: Self = StObject.set(x, "comment", js.undefined)
      
      inline def setCompression(value: Compression): Self = StObject.set(x, "compression", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptions(value: Level): Self = StObject.set(x, "compressionOptions", value.asInstanceOf[js.Any])
      
      inline def setCompressionOptionsNull: Self = StObject.set(x, "compressionOptions", null)
      
      inline def setCompressionOptionsUndefined: Self = StObject.set(x, "compressionOptions", js.undefined)
      
      inline def setCompressionUndefined: Self = StObject.set(x, "compression", js.undefined)
      
      inline def setEncodeFileName(value: /* name */ String => Buffer): Self = StObject.set(x, "encodeFileName", js.Any.fromFunction1(value))
      
      inline def setEncodeFileNameUndefined: Self = StObject.set(x, "encodeFileName", js.undefined)
      
      inline def setMimeType(value: String): Self = StObject.set(x, "mimeType", value.asInstanceOf[js.Any])
      
      inline def setMimeTypeUndefined: Self = StObject.set(x, "mimeType", js.undefined)
      
      inline def setPlatform(value: DOS | UNIX | Platform): Self = StObject.set(x, "platform", value.asInstanceOf[js.Any])
      
      inline def setPlatformUndefined: Self = StObject.set(x, "platform", js.undefined)
      
      inline def setType(value: (js.UndefOr[base64 | string | uint8array | arraybuffer | blob | nodebuffer]) & uint8array): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait Level extends StObject {
    
    var level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`
  }
  object Level {
    
    inline def apply(level: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Level = {
      val __obj = js.Dynamic.literal(level = level.asInstanceOf[js.Any])
      __obj.asInstanceOf[Level]
    }
    
    extension [Self <: Level](x: Self) {
      
      inline def setLevel(value: `1` | `2` | `3` | `4` | `5` | `6` | `7` | `8` | `9`): Self = StObject.set(x, "level", value.asInstanceOf[js.Any])
    }
  }
}
