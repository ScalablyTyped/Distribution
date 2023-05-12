package typings.mirada

import org.scalablytyped.runtime.Instantiable0
import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.mirada.distSrcBrowserVideoReaderMod.Options
import typings.mirada.distSrcBrowserVideoReaderMod.VideoReader
import typings.mirada.distSrcTypesOpencvHacksMod.FileNode
import typings.mirada.distSrcTypesOpencvHacksMod.MatAllocator
import typings.mirada.distSrcTypesOpencvHacksMod.Ptr
import typings.mirada.distSrcTypesOpencvHacksMod.Scalar
import typings.mirada.distSrcTypesOpencvHacksMod.Tp
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.diagType
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.uint32T
import typings.mirada.distSrcTypesOpencvHacksMod.uint64T
import typings.mirada.distSrcTypesOpencvMatMod.Mat
import typings.mirada.distSrcTypesOpencvTypesMod.Affine3
import typings.mirada.distSrcTypesOpencvTypesMod.Algorithm
import typings.mirada.distSrcTypesOpencvTypesMod.BFMatcher
import typings.mirada.distSrcTypesOpencvTypesMod.CascadeClassifier
import typings.mirada.distSrcTypesOpencvTypesMod.DescriptorMatcher
import typings.mirada.distSrcTypesOpencvTypesMod.FlannBasedMatcher
import typings.mirada.distSrcTypesOpencvTypesMod.GScalar
import typings.mirada.distSrcTypesOpencvTypesMod.HOGDescriptor
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.InputOutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Logger
import typings.mirada.distSrcTypesOpencvTypesMod.MatExpr
import typings.mirada.distSrcTypesOpencvTypesMod.MatVector
import typings.mirada.distSrcTypesOpencvTypesMod.Matx
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArrayOfArrays
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.mirada.distSrcTypesOpencvTypesMod.softdouble
import typings.mirada.distSrcTypesOpencvTypesMod.softfloat
import typings.std.AbortSignal
import typings.std.BodyInit
import typings.std.HTMLCanvasElement
import typings.std.HTMLVideoElement
import typings.std.HeadersInit
import typings.std.ReferrerPolicy
import typings.std.RequestCache
import typings.std.RequestCredentials
import typings.std.RequestMode
import typings.std.RequestRedirect
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: js.typedarray.Uint8ClampedArray
    
    var height: Double
    
    var width: Double
  }
  object Data {
    
    inline def apply(data: js.typedarray.Uint8ClampedArray, height: Double, width: Double): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.typedarray.Uint8ClampedArray): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Encoding extends StObject {
    
    var encoding: String
    
    var flags: String
  }
  object Encoding {
    
    inline def apply(encoding: String, flags: String): Encoding = {
      val __obj = js.Dynamic.literal(encoding = encoding.asInstanceOf[js.Any], flags = flags.asInstanceOf[js.Any])
      __obj.asInstanceOf[Encoding]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Encoding] (val x: Self) extends AnyVal {
      
      inline def setEncoding(value: String): Self = StObject.set(x, "encoding", value.asInstanceOf[js.Any])
      
      inline def setFlags(value: String): Self = StObject.set(x, "flags", value.asInstanceOf[js.Any])
    }
  }
  
  trait Height extends StObject {
    
    var height: Double
    
    var width: Double
  }
  object Height {
    
    inline def apply(height: Double, width: Double): Height = {
      val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Height]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Height] (val x: Self) extends AnyVal {
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait Kind extends StObject {
    
    var kind: String
    
    var name: String
  }
  object Kind {
    
    inline def apply(kind: String, name: String): Kind = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Kind]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Kind] (val x: Self) extends AnyVal {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  trait Module extends StObject {
    
    var kind: String
    
    var module: String
    
    var name: String
  }
  object Module {
    
    inline def apply(kind: String, module: String, name: String): Module = {
      val __obj = js.Dynamic.literal(kind = kind.asInstanceOf[js.Any], module = module.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[Module]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Module] (val x: Self) extends AnyVal {
      
      inline def setKind(value: String): Self = StObject.set(x, "kind", value.asInstanceOf[js.Any])
      
      inline def setModule(value: String): Self = StObject.set(x, "module", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.RequestInit & {  name :string | undefined} */
  trait RequestInitnamestringunde extends StObject {
    
    /** A BodyInit object or null to set request's body. */
    /* standard dom */
    var body: js.UndefOr[BodyInit | Null] = js.undefined
    
    /** A string indicating how the request will interact with the browser's cache to set request's cache. */
    /* standard dom */
    var cache: js.UndefOr[RequestCache] = js.undefined
    
    /** A string indicating whether credentials will be sent with the request always, never, or only when sent to a same-origin URL. Sets request's credentials. */
    /* standard dom */
    var credentials: js.UndefOr[RequestCredentials] = js.undefined
    
    /** A Headers object, an object literal, or an array of two-item arrays to set request's headers. */
    /* standard dom */
    var headers: js.UndefOr[HeadersInit] = js.undefined
    
    /** A cryptographic hash of the resource to be fetched by request. Sets request's integrity. */
    /* standard dom */
    var integrity: js.UndefOr[String] = js.undefined
    
    /** A boolean to set request's keepalive. */
    /* standard dom */
    var keepalive: js.UndefOr[Boolean] = js.undefined
    
    /** A string to set request's method. */
    /* standard dom */
    var method: js.UndefOr[String] = js.undefined
    
    /** A string to indicate whether the request will use CORS, or will be restricted to same-origin URLs. Sets request's mode. */
    /* standard dom */
    var mode: js.UndefOr[RequestMode] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    /** A string indicating whether request follows redirects, results in an error upon encountering a redirect, or returns the redirect (in an opaque fashion). Sets request's redirect. */
    /* standard dom */
    var redirect: js.UndefOr[RequestRedirect] = js.undefined
    
    /** A string whose value is a same-origin URL, "about:client", or the empty string, to set request's referrer. */
    /* standard dom */
    var referrer: js.UndefOr[String] = js.undefined
    
    /** A referrer policy to set request's referrerPolicy. */
    /* standard dom */
    var referrerPolicy: js.UndefOr[ReferrerPolicy] = js.undefined
    
    /** An AbortSignal to set request's signal. */
    /* standard dom */
    var signal: js.UndefOr[AbortSignal | Null] = js.undefined
    
    /** Can only be null. Used to disassociate request from any Window. */
    /* standard dom */
    var window: js.UndefOr[Null] = js.undefined
  }
  object RequestInitnamestringunde {
    
    inline def apply(): RequestInitnamestringunde = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RequestInitnamestringunde]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RequestInitnamestringunde] (val x: Self) extends AnyVal {
      
      inline def setBody(value: BodyInit): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyNull: Self = StObject.set(x, "body", null)
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCache(value: RequestCache): Self = StObject.set(x, "cache", value.asInstanceOf[js.Any])
      
      inline def setCacheUndefined: Self = StObject.set(x, "cache", js.undefined)
      
      inline def setCredentials(value: RequestCredentials): Self = StObject.set(x, "credentials", value.asInstanceOf[js.Any])
      
      inline def setCredentialsUndefined: Self = StObject.set(x, "credentials", js.undefined)
      
      inline def setHeaders(value: HeadersInit): Self = StObject.set(x, "headers", value.asInstanceOf[js.Any])
      
      inline def setHeadersUndefined: Self = StObject.set(x, "headers", js.undefined)
      
      inline def setHeadersVarargs(value: (js.Tuple2[String, String])*): Self = StObject.set(x, "headers", js.Array(value*))
      
      inline def setIntegrity(value: String): Self = StObject.set(x, "integrity", value.asInstanceOf[js.Any])
      
      inline def setIntegrityUndefined: Self = StObject.set(x, "integrity", js.undefined)
      
      inline def setKeepalive(value: Boolean): Self = StObject.set(x, "keepalive", value.asInstanceOf[js.Any])
      
      inline def setKeepaliveUndefined: Self = StObject.set(x, "keepalive", js.undefined)
      
      inline def setMethod(value: String): Self = StObject.set(x, "method", value.asInstanceOf[js.Any])
      
      inline def setMethodUndefined: Self = StObject.set(x, "method", js.undefined)
      
      inline def setMode(value: RequestMode): Self = StObject.set(x, "mode", value.asInstanceOf[js.Any])
      
      inline def setModeUndefined: Self = StObject.set(x, "mode", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setRedirect(value: RequestRedirect): Self = StObject.set(x, "redirect", value.asInstanceOf[js.Any])
      
      inline def setRedirectUndefined: Self = StObject.set(x, "redirect", js.undefined)
      
      inline def setReferrer(value: String): Self = StObject.set(x, "referrer", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicy(value: ReferrerPolicy): Self = StObject.set(x, "referrerPolicy", value.asInstanceOf[js.Any])
      
      inline def setReferrerPolicyUndefined: Self = StObject.set(x, "referrerPolicy", js.undefined)
      
      inline def setReferrerUndefined: Self = StObject.set(x, "referrer", js.undefined)
      
      inline def setSignal(value: AbortSignal): Self = StObject.set(x, "signal", value.asInstanceOf[js.Any])
      
      inline def setSignalNull: Self = StObject.set(x, "signal", null)
      
      inline def setSignalUndefined: Self = StObject.set(x, "signal", js.undefined)
    }
  }
  
  @js.native
  trait TypeofAffine3
    extends StObject
       with Instantiable0[Affine3] {
    
    def Identity(): typings.mirada.distSrcTypesOpencvAffine3Mod.Affine3 = js.native
  }
  
  @js.native
  trait TypeofAlgorithm
    extends StObject
       with Instantiable0[Algorithm] {
    
    /**
      *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
      *
      *   ```cpp
      *   Ptr<SVM> svm = Algorithm::load<SVM>("my_svm_model.xml");
      *   ```
      *
      *    In order to make this method work, the derived class must overwrite [Algorithm::read](const
      * [FileNode]& fn).
      *
      * @param filename Name of the file to read.
      *
      * @param objname The optional name of the node to read (if empty, the first top-level node will be
      * used)
      */
    def load(arg0: Any, filename: String): Ptr = js.native
    def load(arg0: Any, filename: String, objname: String): Ptr = js.native
    
    /**
      *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
      *
      *   ```cpp
      *   Ptr<SVM> svm = Algorithm::loadFromString<SVM>(myStringModel);
      *   ```
      *
      * @param strModel The string variable containing the model you want to load.
      *
      * @param objname The optional name of the node to read (if empty, the first top-level node will be
      * used)
      */
    def loadFromString(arg1: Any, strModel: String): Ptr = js.native
    def loadFromString(arg1: Any, strModel: String, objname: String): Ptr = js.native
    
    /**
      *   This is static template method of [Algorithm]. It's usage is following (in the case of SVM):
      *
      *   ```cpp
      *   cv::FileStorage fsRead("example.xml", FileStorage::READ);
      *   Ptr<SVM> svm = Algorithm::read<SVM>(fsRead.root());
      *   ```
      *
      *    In order to make this method work, the derived class must overwrite [Algorithm::read](const
      * [FileNode]& fn) and also have static create() method without parameters (or with all the optional
      * parameters)
      */
    def read(arg2: Any, fn: FileNode): Ptr = js.native
  }
  
  @js.native
  trait TypeofBFMatcher
    extends StObject
       with Instantiable0[BFMatcher]
       with Instantiable1[/* normType */ int, BFMatcher]
       with Instantiable2[(/* normType */ Unit) | (/* normType */ int), /* crossCheck */ bool, BFMatcher] {
    
    /**
      * @param normType One of NORM_L1, NORM_L2, NORM_HAMMING, NORM_HAMMING2. L1 and L2 norms are
      * preferable choices for SIFT and SURF descriptors, NORM_HAMMING should be used with ORB, BRISK and
      * BRIEF, NORM_HAMMING2 should be used with ORB when WTA_K==3 or 4 (see ORB::ORB constructor
      * description).
      *
      * @param crossCheck If it is false, this is will be default BFMatcher behaviour when it finds the k
      * nearest neighbors for each query descriptor. If crossCheck==true, then the knnMatch() method with
      * k=1 will only return pairs (i,j) such that for i-th query descriptor the j-th descriptor in the
      * matcher's collection is the nearest and vice versa, i.e. the BFMatcher will only return consistent
      * pairs. Such technique usually produces best results with minimal number of outliers when there are
      * enough matches. This is alternative to the ratio test, used by D. Lowe in SIFT paper.
      */
    def create(): Ptr = js.native
    def create(normType: Unit, crossCheck: bool): Ptr = js.native
    def create(normType: int): Ptr = js.native
    def create(normType: int, crossCheck: bool): Ptr = js.native
  }
  
  @js.native
  trait TypeofCascadeClassifier
    extends StObject
       with Instantiable0[CascadeClassifier] {
    
    def convert(oldcascade: String, newcascade: String): String = js.native
  }
  
  @js.native
  trait TypeofDescriptorMatcher
    extends StObject
       with Instantiable0[DescriptorMatcher] {
    
    /**
      * @param descriptorMatcherType Descriptor matcher type. Now the following matcher types are
      * supported:
      *   BruteForce (it uses L2 )BruteForce-L1BruteForce-HammingBruteForce-Hamming(2)FlannBased
      */
    def create(descriptorMatcherType: String): Ptr = js.native
    def create(matcherType: Any): Ptr = js.native
  }
  
  @js.native
  trait TypeofFlannBasedMatcher
    extends StObject
       with Instantiable0[FlannBasedMatcher]
       with Instantiable1[/* indexParams */ Ptr, FlannBasedMatcher]
       with Instantiable2[
          (/* indexParams */ Ptr) | (/* indexParams */ Unit), 
          /* searchParams */ Ptr, 
          FlannBasedMatcher
        ] {
    
    def create(): Ptr = js.native
  }
  
  @js.native
  trait TypeofGScalar
    extends StObject
       with Instantiable0[GScalar] {
    
    def all(v: Double*): Scalar = js.native
  }
  
  @js.native
  trait TypeofHOGDescriptor
    extends StObject
       with Instantiable0[HOGDescriptor] {
    
    def getDaimlerPeopleDetector(): Any = js.native
    
    def getDefaultPeopleDetector(): Any = js.native
  }
  
  @js.native
  trait TypeofInputArray
    extends StObject
       with Instantiable0[InputArray] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofInputArrayOfArrays
    extends StObject
       with Instantiable0[InputArrayOfArrays] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofInputOutputArray
    extends StObject
       with Instantiable0[InputOutputArray] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofInputOutputArrayOfA
    extends StObject
       with Instantiable0[InputOutputArrayOfArrays] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofLogger
    extends StObject
       with Instantiable0[Logger] {
    
    def error(fmt: Any, arg121: Any): int = js.native
    
    def fatal(fmt: Any, arg122: Any): int = js.native
    
    def info(fmt: Any, arg123: Any): int = js.native
    
    /**
      *   Print log message
      *
      * @param level Log level
      *
      * @param fmt Message format
      */
    def log(level: int, fmt: Any, arg124: Any): int = js.native
    
    /**
      *   Sets the logging destination
      *
      * @param name Filename or NULL for console
      */
    def setDestination(name: Any): Unit = js.native
    
    /**
      *   Sets the logging level. All messages with lower priority will be ignored.
      *
      * @param level Logging level
      */
    def setLevel(level: int): Unit = js.native
    
    def warn(fmt: Any, arg125: Any): int = js.native
  }
  
  @js.native
  trait TypeofMat
    extends StObject
       with Instantiable0[typings.mirada.distSrcTypesOpencvTypesMod.Mat] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofMatVector
    extends StObject
       with Instantiable0[MatVector] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofMatx
    extends StObject
       with Instantiable0[Matx] {
    
    def all(alpha: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def diag(d: diagType): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def eye(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def ones(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def randn(a: Tp, b: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def randu(a: Tp, b: Tp): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
    
    def zeros(): typings.mirada.distSrcTypesOpencvMatxMod.Matx = js.native
  }
  
  @js.native
  trait TypeofOutputArray
    extends StObject
       with Instantiable0[OutputArray] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofOutputArrayOfArrays
    extends StObject
       with Instantiable0[OutputArrayOfArrays] {
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    def diag(d: Mat): Mat = js.native
    
    /**
      *   The method returns a Matlab-style identity matrix initializer, similarly to [Mat::zeros].
      * Similarly to [Mat::ones], you can use a scale operation to create a scaled identity matrix
      * efficiently:
      *
      *   ```cpp
      *   // make a 4x4 diagonal matrix with 0.1's on the diagonal.
      *   Mat A = Mat::eye(4, 4, CV_32F)*0.1;
      *   ```
      *
      *   In case of multi-channels type, identity matrix will be initialized only for the first channel,
      * the others will be set to 0's
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def eye(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def eye(size: Size, `type`: int): MatExpr = js.native
    
    def getDefaultAllocator(): MatAllocator = js.native
    
    def getStdAllocator(): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def ones(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style 1's array initializer, similarly to [Mat::zeros]. Note that
      * using this method you can initialize an array with an arbitrary value, using the following Matlab
      * idiom:
      *
      *   ```cpp
      *   Mat A = Mat::ones(100, 100, CV_8U)*3; // make 100x100 matrix filled with 3.
      *   ```
      *
      *    The above operation does not form a 100x100 matrix of 1's and then multiply it by 3. Instead, it
      * just remembers the scale factor (3 in this case) and use it when actually invoking the matrix
      * initializer.
      *
      *   In case of multi-channels type, only the first channel will be initialized with 1's, the others
      * will be set to 0's.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def ones(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def ones(size: Size, `type`: int): MatExpr = js.native
    
    def setDefaultAllocator(allocator: MatAllocator): MatAllocator = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims Array dimensionality.
      *
      * @param sz Array of integers specifying the array shape.
      *
      * @param type Created matrix type.
      */
    def zeros(ndims: int, sz: Any, `type`: int): MatExpr = js.native
    /**
      *   The method returns a Matlab-style zero array initializer. It can be used to quickly form a
      * constant array as a function parameter, part of a matrix expression, or as a matrix initializer:
      *
      *   ```cpp
      *   Mat A;
      *   A = Mat::zeros(3, 3, CV_32F);
      *   ```
      *
      *    In the example above, a new matrix is allocated only if A is not a 3x3 floating-point matrix.
      * Otherwise, the existing matrix A is filled with zeros.
      *
      * @param rows Number of rows.
      *
      * @param cols Number of columns.
      *
      * @param type Created matrix type.
      */
    def zeros(rows: int, cols: int, `type`: int): MatExpr = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    def zeros(size: Size, `type`: int): MatExpr = js.native
  }
  
  @js.native
  trait TypeofScalar
    extends StObject
       with Instantiable0[typings.mirada.distSrcTypesOpencvTypesMod.Scalar] {
    
    def all(v: Double*): Scalar = js.native
  }
  
  @js.native
  trait TypeofVideoReader
    extends StObject
       with Instantiable2[/* video */ HTMLVideoElement, /* canvas */ HTMLCanvasElement, VideoReader]
       with Instantiable3[
          /* video */ HTMLVideoElement, 
          /* canvas */ HTMLCanvasElement, 
          /* o */ Options, 
          VideoReader
        ] {
    
    /* protected */ var defaultOptions: Options = js.native
  }
  
  @js.native
  trait Typeofsoftdouble
    extends StObject
       with Instantiable0[softdouble] {
    
    def eps(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    /**
      *   Builds new value from raw binary representation
      */
    def fromRaw(a: uint64T): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def inf(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def max(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def min(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def nan(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def one(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def pi(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
    
    def zero(): typings.mirada.distSrcTypesOpencvSoftdoubleMod.softdouble = js.native
  }
  
  @js.native
  trait Typeofsoftfloat
    extends StObject
       with Instantiable0[softfloat] {
    
    def eps(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    /**
      *   Builds new value from raw binary representation
      */
    def fromRaw(a: uint32T): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def inf(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def max(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def min(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def nan(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def one(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def pi(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
    
    def zero(): typings.mirada.distSrcTypesOpencvSoftfloatMod.softfloat = js.native
  }
}
