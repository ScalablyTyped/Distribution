package typings.mirada.mod

import typings.mirada.distSrcTypesOpencvHacksMod.MatAllocator
import typings.mirada.distSrcTypesOpencvHacksMod.MatCommaInitializer
import typings.mirada.distSrcTypesOpencvHacksMod.Point3
import typings.mirada.distSrcTypesOpencvHacksMod.Point_
import typings.mirada.distSrcTypesOpencvHacksMod.Vec
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvHacksMod.typename
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mirada", "InputOutputArray")
@js.native
/**
  *   These are various constructors that form a matrix. As noted in the AutomaticAllocation, often the
  * default constructor is enough, and the proper matrix will be allocated by an OpenCV function. The
  * constructed matrix can further be assigned to another matrix or matrix expression or can be
  * allocated with [Mat::create] . In the former case, the old content is de-referenced.
  */
open class InputOutputArray ()
  extends typings.mirada.distSrcTypesOpencvMod.InputOutputArray {
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    */
  def this(arg4: Any) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is
    * copied by these constructors. Instead, the header pointing to m data or its sub-array is constructed
    * and associated with it. The reference counter, if any, is incremented. So, when you modify the
    * matrix formed using such a constructor, you also modify the corresponding elements of m . If you
    * want to have an independent copy of the sub-array, use Mat::clone() .
    */
  def this(m: typings.mirada.distSrcTypesOpencvMatMod.Mat) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param vec STL vector whose elements form the matrix. The matrix has a single column and the
    * number of rows equal to the number of vector elements. Type of the matrix matches the type of vector
    * elements. The constructor can handle arbitrary types, for which there is a properly declared
    * DataType . This means that the vector elements must be primitive numbers or uni-type numerical
    * tuples of numbers. Mixed-type structures are not supported. The corresponding constructor is
    * explicit. Since STL vectors are not automatically converted to Mat instances, you should write
    * Mat(vec) explicitly. Unless you copy the data into the matrix ( copyData=true ), no new elements
    * will be added to the vector because it can potentially yield vector data reallocation, and, thus,
    * the matrix data pointer will be invalid.
    *
    * @param copyData Flag to specify whether the underlying data of the STL vector should be copied to
    * (true) or shared with (false) the newly constructed matrix. When the data is copied, the allocated
    * buffer is managed using Mat reference counting mechanism. While the data is shared, the reference
    * counter is NULL, and you should not deallocate the data until the matrix is not destructed.
    */
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    */
  def this(arg3: Any, vec: Any | MatCommaInitializer | Point3 | Point_ | typename) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is
    * copied by these constructors. Instead, the header pointing to m data or its sub-array is constructed
    * and associated with it. The reference counter, if any, is incremented. So, when you modify the
    * matrix formed using such a constructor, you also modify the corresponding elements of m . If you
    * want to have an independent copy of the sub-array, use Mat::clone() .
    *
    * @param roi Region of interest.
    */
  def this(
    m: typings.mirada.distSrcTypesOpencvMatMod.Mat,
    roi: typings.mirada.distSrcTypesOpencvTypesMod.Rect
  ) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is
    * copied by these constructors. Instead, the header pointing to m data or its sub-array is constructed
    * and associated with it. The reference counter, if any, is incremented. So, when you modify the
    * matrix formed using such a constructor, you also modify the corresponding elements of m . If you
    * want to have an independent copy of the sub-array, use Mat::clone() .
    *
    * @param rowRange Range of the m rows to take. As usual, the range start is inclusive and the range
    * end is exclusive. Use Range::all() to take all the rows.
    *
    * @param colRange Range of the m columns to take. Use Range::all() to take all the columns.
    */
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param m Array that (as a whole or partly) is assigned to the constructed matrix. No data is
    * copied by these constructors. Instead, the header pointing to m data or its sub-array is constructed
    * and associated with it. The reference counter, if any, is incremented. So, when you modify the
    * matrix formed using such a constructor, you also modify the corresponding elements of m . If you
    * want to have an independent copy of the sub-array, use Mat::clone() .
    *
    * @param ranges Array of selected ranges of m along each dimensionality.
    */
  def this(m: typings.mirada.distSrcTypesOpencvMatMod.Mat, rowRange: typings.std.Range) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
  def this(sizes: Any, `type`: int) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and
    * the number of columns go in the reverse order.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
  def this(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int) = this()
  def this(arg3: Any, vec: Any | Point3 | Point_, copyData: bool) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    */
  def this(arg4: Any, arg5: Any | sizeT | typename, list: Any) = this()
  def this(arg4: Any, arg5: Unit, list: Any) = this()
  def this(
    m: typings.mirada.distSrcTypesOpencvMatMod.Mat,
    rowRange: typings.std.Range,
    colRange: typings.std.Range
  ) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param ndims Array dimensionality.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
  def this(ndims: int, sizes: Any, `type`: int) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param rows Number of rows in a 2D array.
    *
    * @param cols Number of columns in a 2D array.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    */
  def this(rows: int, cols: int, `type`: int) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param data Pointer to the user data. Matrix constructors that take data and step parameters do
    * not allocate matrix data. Instead, they just initialize the matrix header that points to the
    * specified data, which means that no data is copied. This operation is very efficient and can be used
    * to process external data using OpenCV functions. The external data is not automatically deallocated,
    * so you should take care of it.
    *
    * @param steps Array of ndims-1 steps in case of a multi-dimensional array (the last step is always
    * set to the element size). If not specified, the matrix is assumed to be continuous.
    */
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    */
  def this(sizes: Any, `type`: int, data: Any | Vec) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param s An optional value to initialize each matrix element with. To set all the matrix elements
    * to the particular value after the construction, use the assignment operator Mat::operator=(const
    * Scalar& value) .
    */
  def this(sizes: Any, `type`: int, s: typings.mirada.distSrcTypesOpencvTypesMod.Scalar) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and
    * the number of columns go in the reverse order.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param data Pointer to the user data. Matrix constructors that take data and step parameters do
    * not allocate matrix data. Instead, they just initialize the matrix header that points to the
    * specified data, which means that no data is copied. This operation is very efficient and can be used
    * to process external data using OpenCV functions. The external data is not automatically deallocated,
    * so you should take care of it.
    *
    * @param step Number of bytes each matrix row occupies. The value should include the padding bytes
    * at the end of each row, if any. If the parameter is missing (set to AUTO_STEP ), no padding is
    * assumed and the actual step is calculated as cols*elemSize(). See Mat::elemSize.
    */
  def this(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int, data: Any) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size 2D array size: Size(cols, rows) . In the Size() constructor, the number of rows and
    * the number of columns go in the reverse order.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param s An optional value to initialize each matrix element with. To set all the matrix elements
    * to the particular value after the construction, use the assignment operator Mat::operator=(const
    * Scalar& value) .
    */
  def this(
    size: typings.mirada.distSrcTypesOpencvTypesMod.Size,
    `type`: int,
    s: typings.mirada.distSrcTypesOpencvTypesMod.Scalar
  ) = this()
  def this(arg7: Any, _Nm: sizeT, arr: Any, copyData: bool) = this()
  def this(arg8: Any, n: int, vec: Vec, copyData: bool) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    */
  def this(arg9: Any, m: int, n: int, mtx: typings.mirada.distSrcTypesOpencvTypesMod.Matx) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param ndims Array dimensionality.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param data Pointer to the user data. Matrix constructors that take data and step parameters do
    * not allocate matrix data. Instead, they just initialize the matrix header that points to the
    * specified data, which means that no data is copied. This operation is very efficient and can be used
    * to process external data using OpenCV functions. The external data is not automatically deallocated,
    * so you should take care of it.
    *
    * @param steps Array of ndims-1 steps in case of a multi-dimensional array (the last step is always
    * set to the element size). If not specified, the matrix is assumed to be continuous.
    */
  def this(ndims: int, sizes: Any, `type`: int, data: Any) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param ndims Array dimensionality.
    *
    * @param sizes Array of integers specifying an n-dimensional array shape.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param s An optional value to initialize each matrix element with. To set all the matrix elements
    * to the particular value after the construction, use the assignment operator Mat::operator=(const
    * Scalar& value) .
    */
  def this(ndims: int, sizes: Any, `type`: int, s: typings.mirada.distSrcTypesOpencvTypesMod.Scalar) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param rows Number of rows in a 2D array.
    *
    * @param cols Number of columns in a 2D array.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param data Pointer to the user data. Matrix constructors that take data and step parameters do
    * not allocate matrix data. Instead, they just initialize the matrix header that points to the
    * specified data, which means that no data is copied. This operation is very efficient and can be used
    * to process external data using OpenCV functions. The external data is not automatically deallocated,
    * so you should take care of it.
    *
    * @param step Number of bytes each matrix row occupies. The value should include the padding bytes
    * at the end of each row, if any. If the parameter is missing (set to AUTO_STEP ), no padding is
    * assumed and the actual step is calculated as cols*elemSize(). See Mat::elemSize.
    */
  def this(rows: int, cols: int, `type`: int, data: Any) = this()
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param rows Number of rows in a 2D array.
    *
    * @param cols Number of columns in a 2D array.
    *
    * @param type Array type. Use CV_8UC1, ..., CV_64FC4 to create 1-4 channel matrices, or CV_8UC(n),
    * ..., CV_64FC(n) to create multi-channel (up to CV_CN_MAX channels) matrices.
    *
    * @param s An optional value to initialize each matrix element with. To set all the matrix elements
    * to the particular value after the construction, use the assignment operator Mat::operator=(const
    * Scalar& value) .
    */
  def this(rows: int, cols: int, `type`: int, s: typings.mirada.distSrcTypesOpencvTypesMod.Scalar) = this()
  def this(sizes: Any, `type`: int, data: Any, steps: Any) = this()
  def this(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int, data: Any, step: sizeT) = this()
  def this(arg9: Any, m: int, n: int, mtx: typings.mirada.distSrcTypesOpencvTypesMod.Matx, copyData: bool) = this()
  def this(ndims: int, sizes: Any, `type`: int, data: Any, steps: Any) = this()
  def this(rows: int, cols: int, `type`: int, data: Any, step: sizeT) = this()
}
/* static members */
object InputOutputArray {
  
  @JSImport("mirada", "InputOutputArray")
  @js.native
  val ^ : js.Any = js.native
  
  /**
    *   The method creates a square diagonal matrix from specified main diagonal.
    *
    * @param d One-dimensional matrix that represents the main diagonal.
    */
  inline def diag(d: typings.mirada.distSrcTypesOpencvMatMod.Mat): typings.mirada.distSrcTypesOpencvMatMod.Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(d.asInstanceOf[js.Any]).asInstanceOf[typings.mirada.distSrcTypesOpencvMatMod.Mat]
  
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
  inline def eye(rows: int, cols: int, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size Alternative matrix size specification as Size(cols, rows) .
    *
    * @param type Created matrix type.
    */
  inline def eye(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
  
  inline def getDefaultAllocator(): MatAllocator = ^.asInstanceOf[js.Dynamic].applyDynamic("getDefaultAllocator")().asInstanceOf[MatAllocator]
  
  inline def getStdAllocator(): MatAllocator = ^.asInstanceOf[js.Dynamic].applyDynamic("getStdAllocator")().asInstanceOf[MatAllocator]
  
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
  inline def ones(ndims: int, sz: Any, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(ndims.asInstanceOf[js.Any], sz.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
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
  inline def ones(rows: int, cols: int, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size Alternative to the matrix size specification Size(cols, rows) .
    *
    * @param type Created matrix type.
    */
  inline def ones(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
  
  inline def setDefaultAllocator(allocator: MatAllocator): MatAllocator = ^.asInstanceOf[js.Dynamic].applyDynamic("setDefaultAllocator")(allocator.asInstanceOf[js.Any]).asInstanceOf[MatAllocator]
  
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
  inline def zeros(ndims: int, sz: Any, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(ndims.asInstanceOf[js.Any], sz.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
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
  inline def zeros(rows: int, cols: int, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
  /**
    *   This is an overloaded member function, provided for convenience. It differs from the above
    * function only in what argument(s) it accepts.
    *
    * @param size Alternative to the matrix size specification Size(cols, rows) .
    *
    * @param type Created matrix type.
    */
  inline def zeros(size: typings.mirada.distSrcTypesOpencvTypesMod.Size, `type`: int): typings.mirada.distSrcTypesOpencvTypesMod.MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[typings.mirada.distSrcTypesOpencvTypesMod.MatExpr]
}
