package typings.multer

import org.scalablytyped.runtime.StringDictionary
import typings.express.mod.RequestHandler
import typings.express.mod.Request_
import typings.multer.anon.FieldNameSize
import typings.multer.anon.PartialFile
import typings.multer.mod.global.Express.Multer.File
import typings.node.bufferMod.global.Buffer
import typings.node.streamMod.Readable
import typings.std.Error
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
    * Returns a Multer instance that provides several methods for generating
    * middleware that process files uploaded in `multipart/form-data` format.
    *
    * The `StorageEngine` specified in `storage` will be used to store files. If
    * `storage` is not set and `dest` is, files will be stored in `dest` on the
    * local file system with random names. If neither are set, files will be stored
    * in memory.
    *
    * In addition to files, all generated middleware process all text fields in
    * the request. For each non-file field, the `Request.body` object will be
    * populated with an entry mapping the field name to its string value, or array
    * of string values if multiple fields share the same name.
    */
  inline def apply(): Multer = ^.asInstanceOf[js.Dynamic].apply().asInstanceOf[Multer]
  inline def apply(options: Options): Multer = ^.asInstanceOf[js.Dynamic].apply(options.asInstanceOf[js.Any]).asInstanceOf[Multer]
  
  @JSImport("multer", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("multer", "MulterError")
  @js.native
  open class MulterError protected ()
    extends StObject
       with Error {
    def this(code: ErrorCode) = this()
    def this(code: ErrorCode, field: String) = this()
    
    /** Identifying error code. */
    var code: ErrorCode = js.native
    
    /** Name of the multipart form field associated with this error. */
    var field: js.UndefOr[String] = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
  }
  
  /**
    * Returns a `StorageEngine` implementation configured to store files on
    * the local file system.
    *
    * A string or function may be specified to determine the destination
    * directory, and a function to determine filenames. If no options are set,
    * files will be stored in the system's temporary directory with random 32
    * character filenames.
    */
  inline def diskStorage(options: DiskStorageOptions): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("diskStorage")(options.asInstanceOf[js.Any]).asInstanceOf[StorageEngine]
  
  /**
    * Returns a `StorageEngine` implementation configured to store files in
    * memory as `Buffer` objects.
    */
  inline def memoryStorage(): StorageEngine = ^.asInstanceOf[js.Dynamic].applyDynamic("memoryStorage")().asInstanceOf[StorageEngine]
  
  trait DiskStorageOptions extends StObject {
    
    /**
      * A string or function that determines the destination path for uploaded
      * files. If a string is passed and the directory does not exist, Multer
      * attempts to create it recursively. If neither a string or a function
      * is passed, the destination defaults to `os.tmpdir()`.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to determine the destination path.
      */
    var destination: js.UndefOr[
        String | (js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
          Unit
        ])
      ] = js.undefined
    
    /**
      * A function that determines the name of the uploaded file. If nothing
      * is passed, Multer will generate a 32 character pseudorandom hex string
      * with no extension.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to determine the name of the uploaded file.
      */
    var filename: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* file */ File, 
          /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit], 
          Unit
        ]
      ] = js.undefined
  }
  object DiskStorageOptions {
    
    inline def apply(): DiskStorageOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DiskStorageOptions]
    }
    
    extension [Self <: DiskStorageOptions](x: Self) {
      
      inline def setDestination(
        value: String | (js.Function3[
              /* req */ Request_[
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
                Any, 
                Any, 
                /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
                Record[String, Any]
              ], 
              /* file */ File, 
              /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit], 
              Unit
            ])
      ): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
      
      inline def setDestinationFunction3(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* destination */ String, Unit]) => Unit
      ): Self = StObject.set(x, "destination", js.Any.fromFunction3(value))
      
      inline def setDestinationUndefined: Self = StObject.set(x, "destination", js.undefined)
      
      inline def setFilename(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* file */ File, /* callback */ js.Function2[/* error */ js.Error | Null, /* filename */ String, Unit]) => Unit
      ): Self = StObject.set(x, "filename", js.Any.fromFunction3(value))
      
      inline def setFilenameUndefined: Self = StObject.set(x, "filename", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.multer.multerStrings.LIMIT_PART_COUNT
    - typings.multer.multerStrings.LIMIT_FILE_SIZE
    - typings.multer.multerStrings.LIMIT_FILE_COUNT
    - typings.multer.multerStrings.LIMIT_FIELD_KEY
    - typings.multer.multerStrings.LIMIT_FIELD_VALUE
    - typings.multer.multerStrings.LIMIT_FIELD_COUNT
    - typings.multer.multerStrings.LIMIT_UNEXPECTED_FILE
  */
  trait ErrorCode extends StObject
  object ErrorCode {
    
    inline def LIMIT_FIELD_COUNT: typings.multer.multerStrings.LIMIT_FIELD_COUNT = "LIMIT_FIELD_COUNT".asInstanceOf[typings.multer.multerStrings.LIMIT_FIELD_COUNT]
    
    inline def LIMIT_FIELD_KEY: typings.multer.multerStrings.LIMIT_FIELD_KEY = "LIMIT_FIELD_KEY".asInstanceOf[typings.multer.multerStrings.LIMIT_FIELD_KEY]
    
    inline def LIMIT_FIELD_VALUE: typings.multer.multerStrings.LIMIT_FIELD_VALUE = "LIMIT_FIELD_VALUE".asInstanceOf[typings.multer.multerStrings.LIMIT_FIELD_VALUE]
    
    inline def LIMIT_FILE_COUNT: typings.multer.multerStrings.LIMIT_FILE_COUNT = "LIMIT_FILE_COUNT".asInstanceOf[typings.multer.multerStrings.LIMIT_FILE_COUNT]
    
    inline def LIMIT_FILE_SIZE: typings.multer.multerStrings.LIMIT_FILE_SIZE = "LIMIT_FILE_SIZE".asInstanceOf[typings.multer.multerStrings.LIMIT_FILE_SIZE]
    
    inline def LIMIT_PART_COUNT: typings.multer.multerStrings.LIMIT_PART_COUNT = "LIMIT_PART_COUNT".asInstanceOf[typings.multer.multerStrings.LIMIT_PART_COUNT]
    
    inline def LIMIT_UNEXPECTED_FILE: typings.multer.multerStrings.LIMIT_UNEXPECTED_FILE = "LIMIT_UNEXPECTED_FILE".asInstanceOf[typings.multer.multerStrings.LIMIT_UNEXPECTED_FILE]
  }
  
  /**
    * An object describing a field name and the maximum number of files with
    * that field name to accept.
    */
  trait Field extends StObject {
    
    /** Optional maximum number of files per field to accept. (Default: Infinity) */
    var maxCount: js.UndefOr[Double] = js.undefined
    
    /** The field name. */
    var name: String
  }
  object Field {
    
    inline def apply(name: String): Field = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Field]
    }
    
    extension [Self <: Field](x: Self) {
      
      inline def setMaxCount(value: Double): Self = StObject.set(x, "maxCount", value.asInstanceOf[js.Any])
      
      inline def setMaxCountUndefined: Self = StObject.set(x, "maxCount", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * a function to control which files should be uploaded and which should be skipped
    * pass a boolean to indicate if the file should be accepted
    * pass an error if something goes wrong
    */
  @js.native
  trait FileFilterCallback extends StObject {
    
    def apply(error: js.Error): Unit = js.native
    def apply(error: Null, acceptFile: Boolean): Unit = js.native
  }
  
  /**
    * @see {@link https://github.com/expressjs/multer#api}
    */
  @js.native
  trait Multer extends StObject {
    
    /**
      * Returns middleware that processes all files contained in the multipart
      * request.
      *
      * The `Request` object will be populated with a `files` array containing
      * an information object for each processed file.
      */
    def any(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Returns middleware that processes multiple files sharing the same field
      * name.
      *
      * The `Request` object will be populated with a `files` array containing
      * an information object for each processed file.
      *
      * @param fieldName Shared name of the multipart form fields to process.
      * @param maxCount Optional. Maximum number of files to process. (default: Infinity)
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName`
      */
    def array(fieldName: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    def array(fieldName: String, maxCount: Double): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Returns middleware that processes multiple files associated with the
      * given form fields.
      *
      * The `Request` object will be populated with a `files` object which
      * maps each field name to an array of the associated file information
      * objects.
      *
      * @param fields Array of `Field` objects describing multipart form fields to process.
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if more than `maxCount` files are associated with `fieldName` for any field.
      */
    def fields(fields: js.Array[Field]): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Returns middleware that accepts only non-file multipart form fields.
      *
      * @throws `MulterError('LIMIT_UNEXPECTED_FILE')` if any file is encountered.
      */
    def none(): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
    
    /**
      * Returns middleware that processes a single file associated with the
      * given form field.
      *
      * The `Request` object will be populated with a `file` object containing
      * information about the processed file.
      *
      * @param fieldName Name of the multipart form field to process.
      */
    def single(fieldName: String): RequestHandler[
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
        Any, 
        Any, 
        /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
        Record[String, Any]
      ] = js.native
  }
  
  /** Options for initializing a Multer instance. */
  trait Options extends StObject {
    
    /**
      * The destination directory for uploaded files. If `storage` is not set
      * and `dest` is, Multer will create a `DiskStorage` instance configured
      * to store files at `dest` with random filenames.
      *
      * Ignored if `storage` is set.
      */
    var dest: js.UndefOr[String] = js.undefined
    
    /**
      * Optional function to control which files are uploaded. This is called
      * for every file that is processed.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback  a function to control which files should be uploaded and which should be skipped.
      */
    var fileFilter: js.UndefOr[
        js.Function3[
          /* req */ Request_[
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
            Any, 
            Any, 
            /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
            Record[String, Any]
          ], 
          /* file */ File, 
          /* callback */ FileFilterCallback, 
          Unit
        ]
      ] = js.undefined
    
    /**
      * An object specifying various limits on incoming data. This object is
      * passed to Busboy directly, and the details of properties can be found
      * at https://github.com/mscdex/busboy#busboy-methods.
      */
    var limits: js.UndefOr[FieldNameSize] = js.undefined
    
    /** Preserve the full path of the original filename rather than the basename. (Default: false) */
    var preservePath: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A `StorageEngine` responsible for processing files uploaded via Multer.
      * Takes precedence over `dest`.
      */
    var storage: js.UndefOr[StorageEngine] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setDest(value: String): Self = StObject.set(x, "dest", value.asInstanceOf[js.Any])
      
      inline def setDestUndefined: Self = StObject.set(x, "dest", js.undefined)
      
      inline def setFileFilter(
        value: (/* req */ Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], /* file */ File, /* callback */ FileFilterCallback) => Unit
      ): Self = StObject.set(x, "fileFilter", js.Any.fromFunction3(value))
      
      inline def setFileFilterUndefined: Self = StObject.set(x, "fileFilter", js.undefined)
      
      inline def setLimits(value: FieldNameSize): Self = StObject.set(x, "limits", value.asInstanceOf[js.Any])
      
      inline def setLimitsUndefined: Self = StObject.set(x, "limits", js.undefined)
      
      inline def setPreservePath(value: Boolean): Self = StObject.set(x, "preservePath", value.asInstanceOf[js.Any])
      
      inline def setPreservePathUndefined: Self = StObject.set(x, "preservePath", js.undefined)
      
      inline def setStorage(value: StorageEngine): Self = StObject.set(x, "storage", value.asInstanceOf[js.Any])
      
      inline def setStorageUndefined: Self = StObject.set(x, "storage", js.undefined)
    }
  }
  
  /**
    * Implementations of this interface are responsible for storing files
    * encountered by Multer and returning information on how to access them
    * once stored. Implementations must also provide a method for removing
    * files in the event that an error occurs.
    */
  trait StorageEngine extends StObject {
    
    /**
      * Store the file described by `file`, then invoke the callback with
      * information about the stored file.
      *
      * File contents are available as a stream via `file.stream`. Information
      * passed to the callback will be merged with `file` for subsequent
      * middleware.
      *
      * @param req The Express `Request` object.
      * @param file Object with `stream`, `fieldname`, `originalname`, `encoding`, and `mimetype` defined.
      * @param callback Callback to specify file information.
      */
    def _handleFile(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      file: File,
      callback: js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[PartialFile], Unit]
    ): Unit
    
    /**
      * Remove the file described by `file`, then invoke the callback with.
      *
      * `file` contains all the properties available to `_handleFile`, as
      * well as those returned by `_handleFile`.
      *
      * @param req The Express `Request` object.
      * @param file Object containing information about the processed file.
      * @param callback Callback to indicate completion.
      */
    def _removeFile(
      req: Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ],
      file: File,
      callback: js.Function1[/* error */ js.Error | Null, Unit]
    ): Unit
  }
  object StorageEngine {
    
    inline def apply(
      _handleFile: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[PartialFile], Unit]) => Unit,
      _removeFile: (Request_[
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
          Any, 
          Any, 
          /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
          Record[String, Any]
        ], File, js.Function1[/* error */ js.Error | Null, Unit]) => Unit
    ): StorageEngine = {
      val __obj = js.Dynamic.literal(_handleFile = js.Any.fromFunction3(_handleFile), _removeFile = js.Any.fromFunction3(_removeFile))
      __obj.asInstanceOf[StorageEngine]
    }
    
    extension [Self <: StorageEngine](x: Self) {
      
      inline def set_handleFile(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], File, js.Function2[/* error */ js.UndefOr[Any], /* info */ js.UndefOr[PartialFile], Unit]) => Unit
      ): Self = StObject.set(x, "_handleFile", js.Any.fromFunction3(value))
      
      inline def set_removeFile(
        value: (Request_[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.ParamsDictionary */ Any, 
              Any, 
              Any, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify core.Query */ Any, 
              Record[String, Any]
            ], File, js.Function1[/* error */ js.Error | Null, Unit]) => Unit
      ): Self = StObject.set(x, "_removeFile", js.Any.fromFunction3(value))
    }
  }
  
  object global {
    
    object Express {
      
      object Multer {
        
        /** Object containing file metadata and access information. */
        trait File extends StObject {
          
          /** `MemoryStorage` only: A Buffer containing the entire file. */
          var buffer: Buffer
          
          /** `DiskStorage` only: Directory to which this file has been uploaded. */
          var destination: String
          
          /**
            * Value of the `Content-Transfer-Encoding` header for this file.
            * @deprecated since July 2015
            * @see RFC 7578, Section 4.7
            */
          var encoding: String
          
          /** Name of the form field associated with this file. */
          var fieldname: String
          
          /** `DiskStorage` only: Name of this file within `destination`. */
          var filename: String
          
          /** Value of the `Content-Type` header for this file. */
          var mimetype: String
          
          /** Name of the file on the uploader's computer. */
          var originalname: String
          
          /** `DiskStorage` only: Full path to the uploaded file. */
          var path: String
          
          /** Size of the file in bytes. */
          var size: Double
          
          /**
            * A readable stream of this file. Only available to the `_handleFile`
            * callback for custom `StorageEngine`s.
            */
          var stream: Readable
        }
        object File {
          
          inline def apply(
            buffer: Buffer,
            destination: String,
            encoding: String,
            fieldname: String,
            filename: String,
            mimetype: String,
            originalname: String,
            path: String,
            size: Double,
            stream: Readable
          ): File = {
            val __obj = js.Dynamic.literal(buffer = buffer.asInstanceOf[js.Any], destination = destination.asInstanceOf[js.Any], encoding = encoding.asInstanceOf[js.Any], fieldname = fieldname.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], mimetype = mimetype.asInstanceOf[js.Any], originalname = originalname.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], stream = stream.asInstanceOf[js.Any])
            __obj.asInstanceOf[File]
          }
          
          extension [Self <: File](x: Self) {
            
            inline def setBuffer(value: Buffer): Self = StObject.set(x, "buffer", value.asInstanceOf[js.Any])
            
            inline def setDestination(value: String): Self = StObject.set(x, "destination", value.asInstanceOf[js.Any])
            
            inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
            
            inline def setFieldname(value: String): Self = StObject.set(x, "fieldname", value.asInstanceOf[js.Any])
            
            inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
            
            inline def setMimetype(value: String): Self = StObject.set(x, "mimetype", value.asInstanceOf[js.Any])
            
            inline def setOriginalname(value: String): Self = StObject.set(x, "originalname", value.asInstanceOf[js.Any])
            
            inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
            
            inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
            
            inline def setStream(value: Readable): Self = StObject.set(x, "stream", value.asInstanceOf[js.Any])
          }
        }
      }
      
      trait Request extends StObject {
        
        /** `Multer.File` object populated by `single()` middleware. */
        var file: js.UndefOr[File] = js.undefined
        
        /**
          * Array or dictionary of `Multer.File` object populated by `array()`,
          * `fields()`, and `any()` middleware.
          */
        var files: js.UndefOr[StringDictionary[js.Array[File]] | js.Array[File]] = js.undefined
      }
      object Request {
        
        inline def apply(): Request = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[Request]
        }
        
        extension [Self <: Request](x: Self) {
          
          inline def setFile(value: File): Self = StObject.set(x, "file", value.asInstanceOf[js.Any])
          
          inline def setFileUndefined: Self = StObject.set(x, "file", js.undefined)
          
          inline def setFiles(value: StringDictionary[js.Array[File]] | js.Array[File]): Self = StObject.set(x, "files", value.asInstanceOf[js.Any])
          
          inline def setFilesUndefined: Self = StObject.set(x, "files", js.undefined)
          
          inline def setFilesVarargs(value: File*): Self = StObject.set(x, "files", js.Array(value*))
        }
      }
    }
  }
}
