package typings.mirada

import typings.mirada.distSrcTypesOpencvHacksMod.AccessFlag
import typings.mirada.distSrcTypesOpencvHacksMod.MatAllocator
import typings.mirada.distSrcTypesOpencvHacksMod.MatCommaInitializer
import typings.mirada.distSrcTypesOpencvHacksMod.MatConstIterator
import typings.mirada.distSrcTypesOpencvHacksMod.MatIterator
import typings.mirada.distSrcTypesOpencvHacksMod.MatSize
import typings.mirada.distSrcTypesOpencvHacksMod.MatStep
import typings.mirada.distSrcTypesOpencvHacksMod.Point3
import typings.mirada.distSrcTypesOpencvHacksMod.Point_
import typings.mirada.distSrcTypesOpencvHacksMod.UMat
import typings.mirada.distSrcTypesOpencvHacksMod.UMatData
import typings.mirada.distSrcTypesOpencvHacksMod.UMatUsageFlags
import typings.mirada.distSrcTypesOpencvHacksMod.Vec
import typings.mirada.distSrcTypesOpencvHacksMod.bool
import typings.mirada.distSrcTypesOpencvHacksMod.double
import typings.mirada.distSrcTypesOpencvHacksMod.int
import typings.mirada.distSrcTypesOpencvHacksMod.sizeT
import typings.mirada.distSrcTypesOpencvHacksMod.typename
import typings.mirada.distSrcTypesOpencvHacksMod.uchar
import typings.mirada.distSrcTypesOpencvTypesMod.InputArray
import typings.mirada.distSrcTypesOpencvTypesMod.MatExpr
import typings.mirada.distSrcTypesOpencvTypesMod.Mat_
import typings.mirada.distSrcTypesOpencvTypesMod.Matx
import typings.mirada.distSrcTypesOpencvTypesMod.OutputArray
import typings.mirada.distSrcTypesOpencvTypesMod.Point
import typings.mirada.distSrcTypesOpencvTypesMod.Rect
import typings.mirada.distSrcTypesOpencvTypesMod.Scalar
import typings.mirada.distSrcTypesOpencvTypesMod.Size
import typings.std.Range
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distSrcTypesOpencvMatMod {
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "AUTO_STEP")
  @js.native
  val AUTO_STEP: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "CONTINUOUS_FLAG")
  @js.native
  val CONTINUOUS_FLAG: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "DEPTH_MASK")
  @js.native
  val DEPTH_MASK: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "MAGIC_MASK")
  @js.native
  val MAGIC_MASK: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "MAGIC_VAL")
  @js.native
  val MAGIC_VAL: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "Mat")
  @js.native
  /**
    *   These are various constructors that form a matrix. As noted in the AutomaticAllocation, often the
    * default constructor is enough, and the proper matrix will be allocated by an OpenCV function. The
    * constructed matrix can further be assigned to another matrix or matrix expression or can be
    * allocated with [Mat::create] . In the former case, the old content is de-referenced.
    */
  open class Mat () extends Mat_ {
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
    def this(m: Mat) = this()
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
    def this(m: Mat, roi: Rect) = this()
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
    def this(m: Mat, rowRange: Range) = this()
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
    def this(size: Size, `type`: int) = this()
    def this(arg3: Any, vec: Any | Point3 | Point_, copyData: bool) = this()
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def this(arg4: Any, arg5: Any | sizeT | typename, list: Any) = this()
    def this(arg4: Any, arg5: Unit, list: Any) = this()
    def this(m: Mat, rowRange: Range, colRange: Range) = this()
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
    def this(sizes: Any, `type`: int, s: Scalar) = this()
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
    def this(size: Size, `type`: int, data: Any) = this()
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
    def this(size: Size, `type`: int, s: Scalar) = this()
    def this(arg7: Any, _Nm: sizeT, arr: Any, copyData: bool) = this()
    def this(arg8: Any, n: int, vec: Vec, copyData: bool) = this()
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def this(arg9: Any, m: int, n: int, mtx: Matx) = this()
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
    def this(ndims: int, sizes: Any, `type`: int, s: Scalar) = this()
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
    def this(rows: int, cols: int, `type`: int, s: Scalar) = this()
    def this(sizes: Any, `type`: int, data: Any, steps: Any) = this()
    def this(size: Size, `type`: int, data: Any, step: sizeT) = this()
    def this(arg9: Any, m: int, n: int, mtx: Matx, copyData: bool) = this()
    def this(ndims: int, sizes: Any, `type`: int, data: Any, steps: Any) = this()
    def this(rows: int, cols: int, `type`: int, data: Any, step: sizeT) = this()
    
    /**
      *   The method increments the reference counter associated with the matrix data. If the matrix header
      * points to an external data set (see [Mat::Mat] ), the reference counter is NULL, and the method has
      * no effect in this case. Normally, to avoid memory leaks, the method should not be called explicitly.
      * It is called implicitly by the matrix assignment operator. The reference counter increment is an
      * atomic operation on the platforms that support it. Thus, it is safe to operate on the same matrices
      * asynchronously in different threads.
      */
    def addref(): Unit = js.native
    
    /**
      *   The method is complimentary to [Mat::locateROI] . The typical use of these functions is to
      * determine the submatrix position within the parent matrix and then shift the position somehow.
      * Typically, it can be required for filtering operations when pixels outside of the ROI should be
      * taken into account. When all the method parameters are positive, the ROI needs to grow in all
      * directions by the specified amount, for example:
      *
      *   ```cpp
      *   A.adjustROI(2, 2, 2, 2);
      *   ```
      *
      *    In this example, the matrix size is increased by 4 elements in each direction. The matrix is
      * shifted by 2 elements to the left and 2 elements up, which brings in all the necessary pixels for
      * the filtering with the 5x5 kernel.
      *
      *   adjustROI forces the adjusted ROI to be inside of the parent matrix that is boundaries of the
      * adjusted ROI are constrained by boundaries of the parent matrix. For example, if the submatrix A is
      * located in the first row of a parent matrix and you called A.adjustROI(2, 2, 2, 2) then A will not
      * be increased in the upward direction.
      *
      *   The function is used internally by the OpenCV filtering functions, like filter2D , morphological
      * operations, and so on.
      *
      *   [copyMakeBorder]
      *
      * @param dtop Shift of the top submatrix boundary upwards.
      *
      * @param dbottom Shift of the bottom submatrix boundary downwards.
      *
      * @param dleft Shift of the left submatrix boundary to the left.
      *
      * @param dright Shift of the right submatrix boundary to the right.
      */
    def adjustROI(dtop: int, dbottom: int, dleft: int, dright: int): Mat = js.native
    
    var allocator: MatAllocator = js.native
    
    def begin(arg26: Any): MatConstIterator = js.native
    /**
      *   The methods return the matrix read-only or read-write iterators. The use of matrix iterators is
      * very similar to the use of bi-directional STL iterators. In the example below, the alpha blending
      * function is rewritten using the matrix iterators:
      *
      *   ```cpp
      *   template<typename T>
      *   void alphaBlendRGBA(const Mat& src1, const Mat& src2, Mat& dst)
      *   {
      *       typedef Vec<T, 4> VT;
      *
      *       const float alpha_scale = (float)std::numeric_limits<T>::max(),
      *                   inv_scale = 1.f/alpha_scale;
      *
      *       CV_Assert( src1.type() == src2.type() &&
      *                  src1.type() == traits::Type<VT>::value &&
      *                  src1.size() == src2.size());
      *       Size size = src1.size();
      *       dst.create(size, src1.type());
      *
      *       MatConstIterator_<VT> it1 = src1.begin<VT>(), it1_end = src1.end<VT>();
      *       MatConstIterator_<VT> it2 = src2.begin<VT>();
      *       MatIterator_<VT> dst_it = dst.begin<VT>();
      *
      *       for( ; it1 != it1_end; ++it1, ++it2, ++dst_it )
      *       {
      *           VT pix1 = *it1, pix2 = *it2;
      *           float alpha = pix1[3]*inv_scale, beta = pix2[3]*inv_scale;
      * dst_it = VT(saturate_cast<T>(pix1[0]*alpha + pix2[0]*beta),
      *                        saturate_cast<T>(pix1[1]*alpha + pix2[1]*beta),
      *                        saturate_cast<T>(pix1[2]*alpha + pix2[2]*beta),
      *                        saturate_cast<T>((1 - (1-alpha)*(1-beta))*alpha_scale));
      *       }
      *   }
      *   ```
      */
    @JSName("begin")
    def begin_MatIterator(arg25: Any): MatIterator = js.native
    
    /**
      *   The method returns the number of matrix channels.
      */
    def channels(): int = js.native
    
    /**
      *   -1 if the requirement is not satisfied. Otherwise, it returns the number of elements in the
      * matrix. Note that an element may have multiple channels.
      *   The following code demonstrates its usage for a 2-d matrix:
      *
      *   ```cpp
      *       cv::Mat mat(20, 1, CV_32FC2);
      *       int n = mat.checkVector(2);
      *       CV_Assert(n == 20); // mat has 20 elements
      *
      *       mat.create(20, 2, CV_32FC1);
      *       n = mat.checkVector(1);
      *       CV_Assert(n == -1); // mat is neither a column nor a row vector
      *
      *       n = mat.checkVector(2);
      *       CV_Assert(n == 20); // the 2 columns are considered as 1 element
      *   ```
      *
      *    The following code demonstrates its usage for a 3-d matrix:
      *
      *   ```cpp
      *       int dims[] = {1, 3, 5}; // 1 plane, every plane has 3 rows and 5 columns
      *       mat.create(3, dims, CV_32FC1); // for 3-d mat, it MUST have only 1 channel
      *       n = mat.checkVector(5); // the 5 columns are considered as 1 element
      *       CV_Assert(n == 3);
      *
      *       int dims2[] = {3, 1, 5}; // 3 planes, every plane has 1 row and 5 columns
      *       mat.create(3, dims2, CV_32FC1);
      *       n = mat.checkVector(5); // the 5 columns are considered as 1 element
      *       CV_Assert(n == 3);
      *   ```
      *
      * @param elemChannels Number of channels or number of columns the matrix should have. For a 2-D
      * matrix, when the matrix has only 1 column, then it should have elemChannels channels; When the
      * matrix has only 1 channel, then it should have elemChannels columns. For a 3-D matrix, it should
      * have only one channel. Furthermore, if the number of planes is not one, then the number of rows
      * within every plane has to be 1; if the number of rows within every plane is not 1, then the number
      * of planes has to be 1.
      *
      * @param depth The depth the matrix should have. Set it to -1 when any depth is fine.
      *
      * @param requireContinuous Set it to true to require the matrix to be continuous
      */
    def checkVector(elemChannels: int): int = js.native
    def checkVector(elemChannels: int, depth: Unit, requireContinuous: bool): int = js.native
    def checkVector(elemChannels: int, depth: int): int = js.native
    def checkVector(elemChannels: int, depth: int, requireContinuous: bool): int = js.native
    
    /**
      *   The method makes a new header for the specified matrix column and returns it. This is an O(1)
      * operation, regardless of the matrix size. The underlying data of the new matrix is shared with the
      * original matrix. See also the [Mat::row] description.
      *
      * @param x A 0-based column index.
      */
    def col(x: int): Mat = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param r Range structure containing both the start and the end indices.
      */
    def colRange(r: Range): Mat = js.native
    /**
      *   The method makes a new header for the specified column span of the matrix. Similarly to [Mat::row]
      * and [Mat::col] , this is an O(1) operation.
      *
      * @param startcol An inclusive 0-based start index of the column span.
      *
      * @param endcol An exclusive 0-based ending index of the column span.
      */
    def colRange(startcol: int, endcol: int): Mat = js.native
    
    var cols: int = js.native
    
    /**
      *   The method converts source pixel values to the target data type. saturate_cast<> is applied at the
      * end to avoid possible overflows:
      *
      *   `\\[m(x,y) = saturate \\_ cast<rType>( \\alpha (*this)(x,y) + \\beta )\\]`
      *
      * @param m output matrix; if it does not have a proper size or type before the operation, it is
      * reallocated.
      *
      * @param rtype desired output matrix type or, rather, the depth since the number of channels are the
      * same as the input has; if rtype is negative, the output matrix will have the same type as the input.
      *
      * @param alpha optional scale factor.
      *
      * @param beta optional delta added to the scaled values.
      */
    def convertTo(m: OutputArray, rtype: int): OutputArray = js.native
    def convertTo(m: OutputArray, rtype: int, alpha: Unit, beta: double): OutputArray = js.native
    def convertTo(m: OutputArray, rtype: int, alpha: double): OutputArray = js.native
    def convertTo(m: OutputArray, rtype: int, alpha: double, beta: double): OutputArray = js.native
    
    def copySize(m: Mat): Mat = js.native
    
    /**
      *   The method copies the matrix data to another matrix. Before copying the data, the method invokes :
      *
      *
      *   ```cpp
      *   m.create(this->size(), this->type());
      *   ```
      *
      *    so that the destination matrix is reallocated if needed. While m.copyTo(m); works flawlessly, the
      * function does not handle the case of a partial overlap between the source and the destination
      * matrices.
      *
      *   When the operation mask is specified, if the [Mat::create] call shown above reallocates the
      * matrix, the newly allocated matrix is initialized with all zeros before copying the data.
      *
      * @param m Destination matrix. If it does not have a proper size or type before the operation, it is
      * reallocated.
      */
    def copyTo(m: OutputArray): OutputArray = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param m Destination matrix. If it does not have a proper size or type before the operation, it is
      * reallocated.
      *
      * @param mask Operation mask of the same size as *this. Its non-zero elements indicate which matrix
      * elements need to be copied. The mask has to be of type CV_8U and can have 1 or multiple channels.
      */
    def copyTo(m: OutputArray, mask: InputArray): OutputArray = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param ndims New array dimensionality.
      *
      * @param sizes Array of integers specifying a new array shape.
      *
      * @param type New matrix type.
      */
    def create(ndims: int, sizes: Any, `type`: int): Unit = js.native
    /**
      *   This is one of the key [Mat] methods. Most new-style OpenCV functions and methods that produce
      * arrays call this method for each output array. The method uses the following algorithm:
      *
      * If the current array shape and the type match the new ones, return immediately. Otherwise,
      * de-reference the previous data by calling [Mat::release].
      * Initialize the new header.
      * Allocate the new data of [total()]*elemSize() bytes.
      * Allocate the new, associated with the data, reference counter and set it to 1.
      *
      *   Such a scheme makes the memory management robust and efficient at the same time and helps avoid
      * extra typing for you. This means that usually there is no need to explicitly allocate output arrays.
      * That is, instead of writing:
      *
      *   ```cpp
      *   Mat color;
      *   ...
      *   Mat gray(color.rows, color.cols, color.depth());
      *   cvtColor(color, gray, COLOR_BGR2GRAY);
      *   ```
      *
      *    you can simply write:
      *
      *   ```cpp
      *   Mat color;
      *   ...
      *   Mat gray;
      *   cvtColor(color, gray, COLOR_BGR2GRAY);
      *   ```
      *
      *    because cvtColor, as well as the most of OpenCV functions, calls [Mat::create()] for the output
      * array internally.
      *
      * @param rows New number of rows.
      *
      * @param cols New number of columns.
      *
      * @param type New matrix type.
      */
    def create(rows: int, cols: int, `type`: int): Unit = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param sizes Array of integers specifying a new array shape.
      *
      * @param type New matrix type.
      */
    def create(sizes: Any, `type`: int): Unit = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative new matrix size specification: Size(cols, rows)
      *
      * @param type New matrix type.
      */
    def create(size: Size, `type`: int): Size = js.native
    
    /**
      *   The method computes a cross-product of two 3-element vectors. The vectors must be 3-element
      * floating-point vectors of the same shape and size. The result is another 3-element vector of the
      * same shape and type as operands.
      *
      * @param m Another cross-product operand.
      */
    def cross(m: InputArray): Mat = js.native
    
    @JSName("data")
    var data_Mat: uchar = js.native
    
    var dataend: uchar = js.native
    
    var datalimit: uchar = js.native
    
    var datastart: uchar = js.native
    
    def deallocate(): Unit = js.native
    
    /**
      *   The method returns the identifier of the matrix element depth (the type of each individual
      * channel). For example, for a 16-bit signed element array, the method returns CV_16S . A complete
      * list of matrix types contains the following values:
      *
      * CV_8U - 8-bit unsigned integers ( 0..255 )
      * CV_8S - 8-bit signed integers ( -128..127 )
      * CV_16U - 16-bit unsigned integers ( 0..65535 )
      * CV_16S - 16-bit signed integers ( -32768..32767 )
      * CV_32S - 32-bit signed integers ( -2147483648..2147483647 )
      * CV_32F - 32-bit floating-point numbers ( -FLT_MAX..FLT_MAX, INF, NAN )
      * CV_64F - 64-bit floating-point numbers ( -DBL_MAX..DBL_MAX, INF, NAN )
      */
    def depth(): int = js.native
    
    /**
      *   The method makes a new header for the specified matrix diagonal. The new matrix is represented as
      * a single-column matrix. Similarly to [Mat::row] and [Mat::col], this is an O(1) operation.
      *
      * @param d index of the diagonal, with the following values:
      *   d=0 is the main diagonal.d<0 is a diagonal from the lower half. For example, d=-1 means the
      * diagonal is set immediately below the main one.d>0 is a diagonal from the upper half. For example,
      * d=1 means the diagonal is set immediately above the main one. For example: Matm=(Mat_<int>(3,3)<<
      *   1,2,3,
      *   4,5,6,
      *   7,8,9);
      *   Matd0=m.diag(0);
      *   Matd1=m.diag(1);
      *   Matd_1=m.diag(-1);
      *    The resulting matrices are d0=
      *   [1;
      *   5;
      *   9]
      *   d1=
      *   [2;
      *   6]
      *   d_1=
      *   [4;
      *   8]
      */
    def diag(): Mat = js.native
    def diag(d: int): Mat = js.native
    
    var dims: int = js.native
    
    /**
      *   The method computes a dot-product of two matrices. If the matrices are not single-column or
      * single-row vectors, the top-to-bottom left-to-right scan ordering is used to treat them as 1D
      * vectors. The vectors must have the same size and type. If the matrices have more than one channel,
      * the dot products from all the channels are summed together.
      *
      * @param m another dot-product operand.
      */
    def dot(m: InputArray): InputArray = js.native
    
    /**
      *   The method returns the matrix element size in bytes. For example, if the matrix type is CV_16SC3 ,
      * the method returns 3*sizeof(short) or 6.
      */
    def elemSize(): sizeT = js.native
    
    /**
      *   The method returns the matrix element channel size in bytes, that is, it ignores the number of
      * channels. For example, if the matrix type is CV_16SC3 , the method returns sizeof(short) or 2.
      */
    def elemSize1(): sizeT = js.native
    
    /**
      *   The method returns true if [Mat::total()] is 0 or if [Mat::data] is NULL. Because of [pop_back()]
      * and [resize()] methods `[M.total()] == 0` does not imply that `M.data == NULL`.
      */
    def empty(): bool = js.native
    
    def end(arg28: Any): MatConstIterator = js.native
    /**
      *   The methods return the matrix read-only or read-write iterators, set to the point following the
      * last matrix element.
      */
    @JSName("end")
    def end_MatIterator(arg27: Any): MatIterator = js.native
    
    /**
      *   includes several bit-fields:
      *
      * the magic signature
      * continuity flag
      * depth
      * number of channels
      *
      */
    var flags: int = js.native
    
    /**
      *   The operation passed as argument has to be a function pointer, a function object or a
      * lambda(C++11).
      *
      *   Example 1. All of the operations below put 0xFF the first channel of all matrix elements:
      *
      *   ```cpp
      *   Mat image(1920, 1080, CV_8UC3);
      *   typedef cv::Point3_<uint8_t> Pixel;
      *
      *   // first. raw pointer access.
      *   for (int r = 0; r < image.rows; ++r) {
      *       Pixel* ptr = image.ptr<Pixel>(r, 0);
      *       const Pixel* ptr_end = ptr + image.cols;
      *       for (; ptr != ptr_end; ++ptr) {
      *           ptr->x = 255;
      *       }
      *   }
      *
      *   // Using MatIterator. (Simple but there are a Iterator's overhead)
      *   for (Pixel &p : cv::Mat_<Pixel>(image)) {
      *       p.x = 255;
      *   }
      *
      *   // Parallel execution with function object.
      *   struct Operator {
      *       void operator ()(Pixel &pixel, const int * position) {
      *           pixel.x = 255;
      *       }
      *   };
      *   image.forEach<Pixel>(Operator());
      *
      *   // Parallel execution using C++11 lambda.
      *   image.forEach<Pixel>([](Pixel &p, const int * position) -> void {
      *       p.x = 255;
      *   });
      *   ```
      *
      *    Example 2. Using the pixel's position:
      *
      *   ```cpp
      *   // Creating 3D matrix (255 x 255 x 255) typed uint8_t
      *   // and initialize all elements by the value which equals elements position.
      *   // i.e. pixels (x,y,z) = (1,2,3) is (b,g,r) = (1,2,3).
      *
      *   int sizes[] = { 255, 255, 255 };
      *   typedef cv::Point3_<uint8_t> Pixel;
      *
      *   Mat_<Pixel> image = Mat::zeros(3, sizes, CV_8UC3);
      *
      *   image.forEach<Pixel>([&](Pixel& pixel, const int position[]) -> void {
      *       pixel.x = position[0];
      *       pixel.y = position[1];
      *       pixel.z = position[2];
      *   });
      *   ```
      */
    def forEach(arg29: Any, arg30: Any, operation: Any): Any = js.native
    
    def getUMat(accessFlags: AccessFlag): UMat = js.native
    def getUMat(accessFlags: AccessFlag, usageFlags: UMatUsageFlags): UMat = js.native
    
    /**
      *   The method performs a matrix inversion by means of matrix expressions. This means that a temporary
      * matrix inversion object is returned by the method and can be used further as a part of more complex
      * matrix expressions or can be assigned to a matrix.
      *
      * @param method Matrix inversion method. One of cv::DecompTypes
      */
    def inv(): MatExpr = js.native
    def inv(method: int): MatExpr = js.native
    
    /**
      *   The method returns true if the matrix elements are stored continuously without gaps at the end of
      * each row. Otherwise, it returns false. Obviously, 1x1 or 1xN matrices are always continuous.
      * Matrices created with [Mat::create] are always continuous. But if you extract a part of the matrix
      * using [Mat::col], [Mat::diag], and so on, or constructed a matrix header for externally allocated
      * data, such matrices may no longer have this property.
      *
      *   The continuity flag is stored as a bit in the [Mat::flags] field and is computed automatically
      * when you construct a matrix header. Thus, the continuity check is a very fast operation, though
      * theoretically it could be done as follows:
      *
      *   ```cpp
      *   // alternative implementation of Mat::isContinuous()
      *   bool myCheckMatContinuity(const Mat& m)
      *   {
      *       //return (m.flags & Mat::CONTINUOUS_FLAG) != 0;
      *       return m.rows == 1 || m.step == m.cols*m.elemSize();
      *   }
      *   ```
      *
      *    The method is used in quite a few of OpenCV functions. The point is that element-wise operations
      * (such as arithmetic and logical operations, math functions, alpha blending, color space
      * transformations, and others) do not depend on the image geometry. Thus, if all the input and output
      * arrays are continuous, the functions can process them as very long single-row vectors. The example
      * below illustrates how an alpha-blending function can be implemented:
      *
      *   ```cpp
      *   template<typename T>
      *   void alphaBlendRGBA(const Mat& src1, const Mat& src2, Mat& dst)
      *   {
      *       const float alpha_scale = (float)std::numeric_limits<T>::max(),
      *                   inv_scale = 1.f/alpha_scale;
      *
      *       CV_Assert( src1.type() == src2.type() &&
      *                  src1.type() == CV_MAKETYPE(traits::Depth<T>::value, 4) &&
      *                  src1.size() == src2.size());
      *       Size size = src1.size();
      *       dst.create(size, src1.type());
      *
      *       // here is the idiom: check the arrays for continuity and,
      *       // if this is the case,
      *       // treat the arrays as 1D vectors
      *       if( src1.isContinuous() && src2.isContinuous() && dst.isContinuous() )
      *       {
      *           size.width *= size.height;
      *           size.height = 1;
      *       }
      *       size.width *= 4;
      *
      *       for( int i = 0; i < size.height; i++ )
      *       {
      *           // when the arrays are continuous,
      *           // the outer loop is executed only once
      *           const T* ptr1 = src1.ptr<T>(i);
      *           const T* ptr2 = src2.ptr<T>(i);
      *           T* dptr = dst.ptr<T>(i);
      *
      *           for( int j = 0; j < size.width; j += 4 )
      *           {
      *               float alpha = ptr1[j+3]*inv_scale, beta = ptr2[j+3]*inv_scale;
      *               dptr[j] = saturate_cast<T>(ptr1[j]*alpha + ptr2[j]*beta);
      *               dptr[j+1] = saturate_cast<T>(ptr1[j+1]*alpha + ptr2[j+1]*beta);
      *               dptr[j+2] = saturate_cast<T>(ptr1[j+2]*alpha + ptr2[j+2]*beta);
      *               dptr[j+3] = saturate_cast<T>((1 - (1-alpha)*(1-beta))*alpha_scale);
      *           }
      *       }
      *   }
      *   ```
      *
      *    This approach, while being very simple, can boost the performance of a simple element-operation
      * by 10-20 percents, especially if the image is rather small and the operation is quite simple.
      *
      *   Another OpenCV idiom in this function, a call of [Mat::create] for the destination array, that
      * allocates the destination array unless it already has the proper size and type. And while the newly
      * allocated arrays are always continuous, you still need to check the destination array because
      * [Mat::create] does not always allocate a new matrix.
      */
    def isContinuous(): bool = js.native
    
    /**
      *   After you extracted a submatrix from a matrix using [Mat::row], [Mat::col], [Mat::rowRange],
      * [Mat::colRange], and others, the resultant submatrix points just to the part of the original big
      * matrix. However, each submatrix contains information (represented by datastart and dataend fields)
      * that helps reconstruct the original matrix size and the position of the extracted submatrix within
      * the original matrix. The method locateROI does exactly that.
      *
      * @param wholeSize Output parameter that contains the size of the whole matrix containing this as a
      * part.
      *
      * @param ofs Output parameter that contains an offset of this inside the whole matrix.
      */
    def locateROI(wholeSize: Size, ofs: Point): Size = js.native
    
    /**
      *   The method returns a temporary object encoding per-element array multiplication, with optional
      * scale. Note that this is not a matrix multiplication that corresponds to a simpler "\\*" operator.
      *
      *   Example:
      *
      *   ```cpp
      *   Mat C = A.mul(5/B); // equivalent to divide(A, B, C, 5)
      *   ```
      *
      * @param m Another array of the same type and the same size as *this, or a matrix expression.
      *
      * @param scale Optional scale factor.
      */
    def mul(m: InputArray): MatExpr = js.native
    def mul(m: InputArray, scale: double): MatExpr = js.native
    
    /**
      *   The method removes one or more rows from the bottom of the matrix.
      *
      * @param nelems Number of removed rows. If it is greater than the total number of rows, an exception
      * is thrown.
      */
    def pop_back(): Unit = js.native
    def pop_back(nelems: sizeT): Unit = js.native
    
    /**
      *   The methods return `uchar*` or typed pointer to the specified matrix row. See the sample in
      * [Mat::isContinuous] to know how to use these methods.
      *
      * @param i0 A 0-based row index.
      */
    def ptr(): uchar = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(arg37: Any): Any = js.native
    def ptr(arg37: Any, i0: int): Any = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param row Index along the dimension 0
      *
      * @param col Index along the dimension 1
      */
    def ptr(arg39: Any, row: int, col: int): Any = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(arg41: Any, i0: int, i1: int, i2: int): Any = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(arg43: Any, idx: Any): Any = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(arg45: Any, n: int, idx: Vec): Vec = js.native
    def ptr(i0: int): uchar = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(i0: int, i1: int, i2: int): uchar = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def ptr(n: int, idx: Vec): uchar = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param row Index along the dimension 0
      *
      * @param col Index along the dimension 1
      */
    def ptr(row: int, col: int): uchar = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    @JSName("ptr")
    def ptr_uchar(idx: Any): uchar = js.native
    
    /**
      *   The methods add one or more elements to the bottom of the matrix. They emulate the corresponding
      * method of the STL vector class. When elem is [Mat] , its type and the number of columns must be the
      * same as in the container matrix.
      *
      * @param elem Added element(s).
      */
    def push_back(arg47: Any, elem: Any): Any = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param elem Added element(s).
      */
    def push_back(arg48: Any, elem: Mat_): Mat_ = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param m Added line(s).
      */
    def push_back(m: Mat): Mat = js.native
    
    def push_back_(elem: Any): Unit = js.native
    
    /**
      *   The method decrements the reference counter associated with the matrix data. When the reference
      * counter reaches 0, the matrix data is deallocated and the data and the reference counter pointers
      * are set to NULL's. If the matrix header points to an external data set (see [Mat::Mat] ), the
      * reference counter is NULL, and the method has no effect in this case.
      *
      *   This method can be called manually to force the matrix data deallocation. But since this method is
      * automatically called in the destructor, or by any other method that changes the data pointer, it is
      * usually not needed. The reference counter decrement and check for 0 is an atomic operation on the
      * platforms that support it. Thus, it is safe to operate on the same matrices asynchronously in
      * different threads.
      */
    def release(): Unit = js.native
    
    /**
      *   The method reserves space for sz rows. If the matrix already has enough space to store sz rows,
      * nothing happens. If the matrix is reallocated, the first [Mat::rows] rows are preserved. The method
      * emulates the corresponding method of the STL vector class.
      *
      * @param sz Number of rows.
      */
    def reserve(sz: sizeT): Unit = js.native
    
    /**
      *   The method reserves space for sz bytes. If the matrix already has enough space to store sz bytes,
      * nothing happens. If matrix has to be reallocated its previous content could be lost.
      *
      * @param sz Number of bytes.
      */
    def reserveBuffer(sz: sizeT): Unit = js.native
    
    /**
      *   The method makes a new matrix header for *this elements. The new matrix may have a different size
      * and/or different number of channels. Any combination is possible if:
      *
      * No extra elements are included into the new matrix and no elements are excluded. Consequently, the
      * product rows*cols*channels() must stay the same after the transformation.
      * No data is copied. That is, this is an O(1) operation. Consequently, if you change the number of
      * rows, or the operation changes the indices of elements row in some other way, the matrix must be
      * continuous. See [Mat::isContinuous] .
      *
      *   For example, if there is a set of 3D points stored as an STL vector, and you want to represent the
      * points as a 3xN matrix, do the following:
      *
      *   ```cpp
      *   std::vector<Point3f> vec;
      *   ...
      *   Mat pointMat = Mat(vec). // convert vector to Mat, O(1) operation
      *                     reshape(1). // make Nx3 1-channel matrix out of Nx1 3-channel.
      *                                 // Also, an O(1) operation
      *                        t(); // finally, transpose the Nx3 matrix.
      *                             // This involves copying all the elements
      *   ```
      *
      * @param cn New number of channels. If the parameter is 0, the number of channels remains the same.
      *
      * @param rows New number of rows. If the parameter is 0, the number of rows remains the same.
      */
    def reshape(cn: int): Mat = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def reshape(cn: int, newndims: int, newsz: Any): Mat = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      */
    def reshape(cn: int, newshape: Any): Mat = js.native
    def reshape(cn: int, rows: int): Mat = js.native
    
    /**
      *   The methods change the number of matrix rows. If the matrix is reallocated, the first
      * min(Mat::rows, sz) rows are preserved. The methods emulate the corresponding methods of the STL
      * vector class.
      *
      * @param sz New number of rows.
      */
    def resize(sz: sizeT): Unit = js.native
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param sz New number of rows.
      *
      * @param s Value assigned to the newly added elements.
      */
    def resize(sz: sizeT, s: Scalar): Scalar = js.native
    
    /**
      *   The method makes a new header for the specified matrix row and returns it. This is an O(1)
      * operation, regardless of the matrix size. The underlying data of the new matrix is shared with the
      * original matrix. Here is the example of one of the classical basic matrix processing operations,
      * axpy, used by LU and many other algorithms:
      *
      *   ```cpp
      *   inline void matrix_axpy(Mat& A, int i, int j, double alpha)
      *   {
      *       A.row(i) += A.row(j)*alpha;
      *   }
      *   ```
      *
      *   In the current implementation, the following code does not work as expected:
      *
      *   ```cpp
      *   Mat A;
      *   ...
      *   A.row(i) = A.row(j); // will not work
      *   ```
      *
      *    This happens because A.row(i) forms a temporary header that is further assigned to another
      * header. Remember that each of these operations is O(1), that is, no data is copied. Thus, the above
      * assignment is not true if you may have expected the j-th row to be copied to the i-th row. To
      * achieve that, you should either turn this simple assignment into an expression or use the
      * [Mat::copyTo] method:
      *
      *   ```cpp
      *   Mat A;
      *   ...
      *   // works, but looks a bit obscure.
      *   A.row(i) = A.row(j) + 0;
      *   // this is a bit longer, but the recommended method.
      *   A.row(j).copyTo(A.row(i));
      *   ```
      *
      * @param y A 0-based row index.
      */
    def row(y: int): Mat = js.native
    
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param r Range structure containing both the start and the end indices.
      */
    def rowRange(r: Range): Mat = js.native
    /**
      *   The method makes a new header for the specified row span of the matrix. Similarly to [Mat::row]
      * and [Mat::col] , this is an O(1) operation.
      *
      * @param startrow An inclusive 0-based start index of the row span.
      *
      * @param endrow An exclusive 0-based ending index of the row span.
      */
    def rowRange(startrow: int, endrow: int): Mat = js.native
    
    var rows: int = js.native
    
    /**
      *   This is an advanced variant of the [Mat::operator=(const Scalar& s)] operator.
      *
      * @param value Assigned scalar converted to the actual array type.
      *
      * @param mask Operation mask of the same size as *this. Its non-zero elements indicate which matrix
      * elements need to be copied. The mask has to be of type CV_8U and can have 1 or multiple channels
      */
    def setTo(value: InputArray): Mat = js.native
    def setTo(value: InputArray, mask: InputArray): Mat = js.native
    def setTo(value: Scalar): Mat = js.native
    def setTo(value: Scalar, mask: InputArray): Mat = js.native
    
    def size(): typings.mirada.distSrcTypesOpencvHacksMod.Size = js.native
    @JSName("size")
    var size_Original: MatSize = js.native
    
    var step: MatStep = js.native
    
    /**
      *   The method returns a matrix step divided by [Mat::elemSize1()] . It can be useful to quickly
      * access an arbitrary matrix element.
      */
    def step1(): sizeT = js.native
    def step1(i: int): sizeT = js.native
    
    /**
      *   The method performs matrix transposition by means of matrix expressions. It does not perform the
      * actual transposition but returns a temporary matrix transposition object that can be further used as
      * a part of more complex matrix expressions or can be assigned to a matrix:
      *
      *   ```cpp
      *   Mat A1 = A + Mat::eye(A.size(), A.type())*lambda;
      *   Mat C = A1.t()*A1; // compute (A + lambda*I)^t * (A + lamda*I)
      *   ```
      */
    def t(): MatExpr = js.native
    
    /**
      *   The method returns the number of array elements (a number of pixels if the array represents an
      * image).
      */
    def total(): sizeT = js.native
    /**
      *   The method returns the number of elements within a certain sub-array slice with startDim <= dim <
      * endDim
      */
    def total(startDim: int): sizeT = js.native
    def total(startDim: int, endDim: int): sizeT = js.native
    
    /**
      *   The method returns a matrix element type. This is an identifier compatible with the CvMat type
      * system, like CV_16SC3 or 16-bit signed 3-channel array, and so on.
      */
    def `type`(): int = js.native
    
    var u: UMatData = js.native
    
    def updateContinuityFlag(): Unit = js.native
  }
  /* static members */
  object Mat {
    
    @JSImport("mirada/dist/src/types/opencv/Mat", "Mat")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      *   The method creates a square diagonal matrix from specified main diagonal.
      *
      * @param d One-dimensional matrix that represents the main diagonal.
      */
    inline def diag(d: Mat): Mat = ^.asInstanceOf[js.Dynamic].applyDynamic("diag")(d.asInstanceOf[js.Any]).asInstanceOf[Mat]
    
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
    inline def eye(rows: int, cols: int, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative matrix size specification as Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    inline def eye(size: Size, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("eye")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
    
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
    inline def ones(ndims: int, sz: Any, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(ndims.asInstanceOf[js.Any], sz.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
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
    inline def ones(rows: int, cols: int, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    inline def ones(size: Size, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("ones")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
    
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
    inline def zeros(ndims: int, sz: Any, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(ndims.asInstanceOf[js.Any], sz.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
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
    inline def zeros(rows: int, cols: int, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(rows.asInstanceOf[js.Any], cols.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
    /**
      *   This is an overloaded member function, provided for convenience. It differs from the above
      * function only in what argument(s) it accepts.
      *
      * @param size Alternative to the matrix size specification Size(cols, rows) .
      *
      * @param type Created matrix type.
      */
    inline def zeros(size: Size, `type`: int): MatExpr = (^.asInstanceOf[js.Dynamic].applyDynamic("zeros")(size.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[MatExpr]
  }
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "SUBMATRIX_FLAG")
  @js.native
  val SUBMATRIX_FLAG: Any = js.native
  
  @JSImport("mirada/dist/src/types/opencv/Mat", "TYPE_MASK")
  @js.native
  val TYPE_MASK: Any = js.native
}
