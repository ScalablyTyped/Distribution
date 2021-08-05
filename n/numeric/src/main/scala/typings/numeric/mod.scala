package typings.numeric

import org.scalablytyped.runtime.Shortcut
import typings.numeric.anon.A
import typings.numeric.anon.B
import typings.numeric.anon.E
import typings.numeric.anon.F
import typings.numeric.anon.H
import typings.numeric.anon.Hinv
import typings.numeric.anon.Iact
import typings.numeric.anon.Iterations
import typings.numeric.anon.Random
import typings.numeric.anon.S
import typings.numeric.numericStrings.L
import typings.numeric.numericStrings.periodic
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("numeric", JSImport.Namespace)
  @js.native
  val ^ : Numeric = js.native
  
  type CCSComparisonResult = js.Tuple3[Vector, Vector, VectorBoolean]
  
  type DeprecatedSparseMatrix = js.Array[js.Array[js.UndefOr[Double]]]
  
  type DeprecatedSparseVector = js.Array[js.UndefOr[Double]]
  
  trait Dopri extends StObject {
    
    def at(x: Vector): Vector | Matrix
    
    var events: js.UndefOr[Boolean | VectorBoolean] = js.undefined
    
    var f: Vector
    
    var iterations: Double
    
    var msg: String
    
    var x: Vector
    
    var y: Vector
    
    var ymid: Vector
  }
  object Dopri {
    
    inline def apply(
      at: Vector => Vector | Matrix,
      f: Vector,
      iterations: Double,
      msg: String,
      x: Vector,
      y: Vector,
      ymid: Vector
    ): Dopri = {
      val __obj = js.Dynamic.literal(at = js.Any.fromFunction1(at), f = f.asInstanceOf[js.Any], iterations = iterations.asInstanceOf[js.Any], msg = msg.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any], ymid = ymid.asInstanceOf[js.Any])
      __obj.asInstanceOf[Dopri]
    }
    
    extension [Self <: Dopri](x: Self) {
      
      inline def setAt(value: Vector => Vector | Matrix): Self = StObject.set(x, "at", js.Any.fromFunction1(value))
      
      inline def setEvents(value: Boolean | VectorBoolean): Self = StObject.set(x, "events", value.asInstanceOf[js.Any])
      
      inline def setEventsUndefined: Self = StObject.set(x, "events", js.undefined)
      
      inline def setEventsVarargs(value: Boolean*): Self = StObject.set(x, "events", js.Array(value :_*))
      
      inline def setF(value: Vector): Self = StObject.set(x, "f", value.asInstanceOf[js.Any])
      
      inline def setFVarargs(value: Double*): Self = StObject.set(x, "f", js.Array(value :_*))
      
      inline def setIterations(value: Double): Self = StObject.set(x, "iterations", value.asInstanceOf[js.Any])
      
      inline def setMsg(value: String): Self = StObject.set(x, "msg", value.asInstanceOf[js.Any])
      
      inline def setX(value: Vector): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setXVarargs(value: Double*): Self = StObject.set(x, "x", js.Array(value :_*))
      
      inline def setY(value: Vector): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      inline def setYVarargs(value: Double*): Self = StObject.set(x, "y", js.Array(value :_*))
      
      inline def setYmid(value: Vector): Self = StObject.set(x, "ymid", value.asInstanceOf[js.Any])
      
      inline def setYmidVarargs(value: Double*): Self = StObject.set(x, "ymid", js.Array(value :_*))
    }
  }
  
  trait LU extends StObject {
    
    var L: Matrix
    
    var U: Matrix
  }
  object LU {
    
    inline def apply(L: Matrix, U: Matrix): LU = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
      __obj.asInstanceOf[LU]
    }
    
    extension [Self <: LU](x: Self) {
      
      inline def setL(value: Matrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setLVarargs(value: js.Array[Double]*): Self = StObject.set(x, "L", js.Array(value :_*))
      
      inline def setU(value: Matrix): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
      
      inline def setUVarargs(value: js.Array[Double]*): Self = StObject.set(x, "U", js.Array(value :_*))
    }
  }
  
  trait LUPP extends StObject {
    
    var L: SparseMatrix
    
    var P: Vector
    
    var Pinv: Vector
    
    var U: SparseMatrix
  }
  object LUPP {
    
    inline def apply(L: SparseMatrix, P: Vector, Pinv: Vector, U: SparseMatrix): LUPP = {
      val __obj = js.Dynamic.literal(L = L.asInstanceOf[js.Any], P = P.asInstanceOf[js.Any], Pinv = Pinv.asInstanceOf[js.Any], U = U.asInstanceOf[js.Any])
      __obj.asInstanceOf[LUPP]
    }
    
    extension [Self <: LUPP](x: Self) {
      
      inline def setL(value: SparseMatrix): Self = StObject.set(x, "L", value.asInstanceOf[js.Any])
      
      inline def setP(value: Vector): Self = StObject.set(x, "P", value.asInstanceOf[js.Any])
      
      inline def setPVarargs(value: Double*): Self = StObject.set(x, "P", js.Array(value :_*))
      
      inline def setPinv(value: Vector): Self = StObject.set(x, "Pinv", value.asInstanceOf[js.Any])
      
      inline def setPinvVarargs(value: Double*): Self = StObject.set(x, "Pinv", js.Array(value :_*))
      
      inline def setU(value: SparseMatrix): Self = StObject.set(x, "U", value.asInstanceOf[js.Any])
    }
  }
  
  type Matrix = js.Array[js.Array[Double]]
  
  type MultidimensionalArray[T] = js.Array[
    js.Array[
      (js.Array[
        (js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    js.Array[
                      (js.Array[(js.Array[(js.Array[(js.Array[(js.Array[js.Array[T] | T]) | T]) | T]) | T]) | T]) | T
                    ]
                  ]) | T
                ]) | T
              ]) | T
            ]) | T
          ]) | T
        ]) | T
      ]) | T
    ]
  ]
  
  type MultidimensionalMatrix = MultidimensionalArray[Double]
  
  type NonNullPrimitive = js.UndefOr[Double | String | Boolean]
  
  type NonScalar = Vector | MultidimensionalMatrix
  
  @js.native
  trait Numeric extends StObject {
    
    def apply(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def apply(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def apply(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def apply(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    @JSName("&")
    def Ampersand(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&")
    def Ampersand(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&")
    def Ampersand(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&")
    def Ampersand(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    @JSName("&&")
    def AmpersandAmpersand(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&&")
    def AmpersandAmpersand(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&&")
    def AmpersandAmpersand(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&&")
    def AmpersandAmpersand(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("&&")
    def AmpersandAmpersand_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("&&")
    def AmpersandAmpersand_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("&&")
    def AmpersandAmpersand_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("&")
    def Ampersand_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("&")
    def Ampersand_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("&")
    def Ampersand_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("*")
    def Asterisk(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("*")
    def Asterisk(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("*")
    def Asterisk(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("*")
    def Asterisk(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("*")
    def Asterisk_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("*")
    def Asterisk_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("*")
    def Asterisk_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("===")
    def EqualssignEqualssignEqualssign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName("===")
    def EqualssignEqualssignEqualssign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("===")
    def EqualssignEqualssignEqualssign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName("===")
    def EqualssignEqualssignEqualssign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName("===")
    def EqualssignEqualssignEqualssign(x: Vector, y: Scalar): VectorBoolean = js.native
    @JSName("===")
    def EqualssignEqualssignEqualssign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign(x: Vector, y: Scalar): VectorBoolean = js.native
    @JSName("!==")
    def ExclamationmarkEqualssignEqualssign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName(">")
    def Greaterthansign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName(">")
    def Greaterthansign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName(">")
    def Greaterthansign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName(">")
    def Greaterthansign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName(">")
    def Greaterthansign(x: Vector, y: Scalar): VectorBoolean = js.native
    
    @JSName(">=")
    def GreaterthansignEqualssign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName(">=")
    def GreaterthansignEqualssign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName(">=")
    def GreaterthansignEqualssign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName(">=")
    def GreaterthansignEqualssign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName(">=")
    def GreaterthansignEqualssign(x: Vector, y: Scalar): VectorBoolean = js.native
    @JSName(">=")
    def GreaterthansignEqualssign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName(">>")
    def GreaterthansignGreaterthansign(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>")
    def GreaterthansignGreaterthansign(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>")
    def GreaterthansignGreaterthansign(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>")
    def GreaterthansignGreaterthansign(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName(">>>")
    def GreaterthansignGreaterthansignGreaterthansign_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName(">>")
    def GreaterthansignGreaterthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName(">>")
    def GreaterthansignGreaterthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName(">>")
    def GreaterthansignGreaterthansign_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName(">")
    def Greaterthansign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def LU(matrix: Matrix): typings.numeric.anon.LU = js.native
    def LU(matrix: Matrix, fast: Boolean): typings.numeric.anon.LU = js.native
    
    def LUsolve(lup: typings.numeric.anon.LU, vector: Vector): Vector = js.native
    
    @JSName("<")
    def Lessthansign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName("<")
    def Lessthansign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("<")
    def Lessthansign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName("<")
    def Lessthansign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName("<")
    def Lessthansign(x: Vector, y: Scalar): VectorBoolean = js.native
    
    @JSName("<=")
    def LessthansignEqualssign(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    @JSName("<=")
    def LessthansignEqualssign(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("<=")
    def LessthansignEqualssign(x: Scalar, y: Scalar, args: Scalar*): Boolean = js.native
    @JSName("<=")
    def LessthansignEqualssign(x: Scalar, y: Vector): VectorBoolean = js.native
    @JSName("<=")
    def LessthansignEqualssign(x: Vector, y: Scalar): VectorBoolean = js.native
    @JSName("<=")
    def LessthansignEqualssign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("<<")
    def LessthansignLessthansign(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("<<")
    def LessthansignLessthansign(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("<<")
    def LessthansignLessthansign(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("<<")
    def LessthansignLessthansign(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("<<")
    def LessthansignLessthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("<<")
    def LessthansignLessthansign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("<<")
    def LessthansignLessthansign_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("<")
    def Lessthansign_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("%")
    def Percentsign(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("%")
    def Percentsign(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("%")
    def Percentsign(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("%")
    def Percentsign(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("%")
    def Percentsign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("%")
    def Percentsign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("%")
    def Percentsign_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("+")
    def Plussign(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("+")
    def Plussign(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("+")
    def Plussign(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("+")
    def Plussign(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("+")
    def Plussign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("+")
    def Plussign_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("+")
    def Plussign_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def QRFrancis(x: Matrix): B = js.native
    def QRFrancis(x: Matrix, maxiter: Double): B = js.native
    
    @JSName("/")
    def Slash(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("/")
    def Slash(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("/")
    def Slash(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("/")
    def Slash(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("/")
    def Slash_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("/")
    def Slash_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("/")
    def Slash_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("|")
    def Verticalline(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("|")
    def Verticalline(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("|")
    def Verticalline(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("|")
    def Verticalline(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    @JSName("||")
    def VerticallineVerticalline(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("||")
    def VerticallineVerticalline(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("||")
    def VerticallineVerticalline(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("||")
    def VerticallineVerticalline(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("||")
    def VerticallineVerticalline_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("||")
    def VerticallineVerticalline_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("||")
    def VerticallineVerticalline_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("|")
    def Verticalline_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("|")
    def Verticalline_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("|")
    def Verticalline_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    @JSName("-")
    def _dash(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("-")
    def _dash(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("-")
    def _dash(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    @JSName("-")
    def _dash(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    @JSName("-")
    def _dash_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("-")
    def _dash_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("-")
    def _dash_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    // Pointwise Math.abs(x)
    def abs(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def absV(x: Vector): Vector = js.native
    
    def abseq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def abseqV(x: Vector): Vector = js.native
    
    // Pointwise arc-cosine
    def acos(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def acosV(x: Vector): Vector = js.native
    
    def acoseq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def acoseqV(x: Vector): Vector = js.native
    
    def add(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def add(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def add(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def add(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def addSV(x: Scalar, y: Vector): Vector = js.native
    
    def addVS(x: Vector, y: Scalar): Vector = js.native
    
    def addVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("add")
    def add_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("add")
    def add_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise sum x+y
    @JSName("add")
    def add_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def addeq(x: Vector, y: Scalar): Vector = js.native
    def addeq(x: Vector, y: Vector): Vector = js.native
    
    def addeqS(x: Vector, y: Scalar): Vector = js.native
    
    def addeqV(x: Vector, y: Vector): Vector = js.native
    
    //     All the components of x are true
    def all(x: js.Any): Boolean = js.native
    
    def allV(x: js.Array[js.Any]): Boolean = js.native
    
    def and(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def and(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def and(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def and(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def andSV(x: Scalar, y: Vector): Vector = js.native
    
    def andVS(x: Vector, y: Scalar): Vector = js.native
    
    def andVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("and")
    def and_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("and")
    def and_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x && y
    @JSName("and")
    def and_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def andeq(x: Vector, y: Scalar): Vector = js.native
    def andeq(x: Vector, y: Vector): Vector = js.native
    
    def andeqS(x: Vector, y: Scalar): Vector = js.native
    
    def andeqV(x: Vector, y: Vector): Vector = js.native
    
    // One or more of the components of x are true
    def any(x: js.Any): Boolean = js.native
    
    def anyV(x: js.Array[js.Any]): Boolean = js.native
    
    // Pointwise arc-sine
    def asin(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def asinV(x: Vector): Vector = js.native
    
    def asineq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def asineqV(x: Vector): Vector = js.native
    
    // Pointwise arc-tangent
    def atan(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def atan2(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def atan2(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def atan2(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def atan2(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def atan2SV(x: Scalar, y: Vector): Vector = js.native
    
    def atan2VS(x: Vector, y: Scalar): Vector = js.native
    
    def atan2VV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("atan2")
    def atan2_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("atan2")
    def atan2_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise    arc-tangent (two parameters)
    @JSName("atan2")
    def atan2_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def atan2eq(x: Vector, y: Scalar): Vector = js.native
    def atan2eq(x: Vector, y: Vector): Vector = js.native
    
    def atan2eqS(x: Vector, y: Scalar): Vector = js.native
    
    def atan2eqV(x: Vector, y: Vector): Vector = js.native
    
    def atanV(x: Vector): Vector = js.native
    
    def ataneq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def ataneqV(x: Vector): Vector = js.native
    
    def band(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def band(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def band(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def band(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def bandSV(x: Scalar, y: Vector): Vector = js.native
    
    def bandVS(x: Vector, y: Scalar): Vector = js.native
    
    def bandVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("band")
    def band_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("band")
    def band_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x & y
    @JSName("band")
    def band_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def bandeq(x: Vector, y: Scalar): Vector = js.native
    def bandeq(x: Vector, y: Vector): Vector = js.native
    
    def bandeqS(x: Vector, y: Scalar): Vector = js.native
    
    def bandeqV(x: Vector, y: Vector): Vector = js.native
    
    // utility functions
    // Benchmarking routine
    def bench(func: js.Function0[js.Any]): Double = js.native
    def bench(func: js.Function0[js.Any], interval: Double): Double = js.native
    
    def blockMatrix(x: MultidimensionalMatrix | Vector): Matrix = js.native
    // create two-dimensional matrix
    def blockMatrix(x: Scalar): Matrix = js.native
    
    def bnot(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    // Pointwise binary negation ~x
    def bnot(x: Double): Double = js.native
    
    def bnotV(x: Vector): Vector = js.native
    
    def bnoteq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    def bnoteq(x: Double): Double = js.native
    
    def bnoteqV(x: Vector): Vector = js.native
    
    def bor(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def bor(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def bor(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def bor(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def borSV(x: Scalar, y: Vector): Vector = js.native
    
    def borVS(x: Vector, y: Scalar): Vector = js.native
    
    def borVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("bor")
    def bor_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("bor")
    def bor_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise binary or x|y
    @JSName("bor")
    def bor_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def boreq(x: Vector, y: Scalar): Vector = js.native
    def boreq(x: Vector, y: Vector): Vector = js.native
    
    def boreqS(x: Vector, y: Scalar): Vector = js.native
    
    def boreqV(x: Vector, y: Vector): Vector = js.native
    
    def bxor(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def bxor(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def bxor(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def bxor(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def bxorSV(x: Scalar, y: Vector): Vector = js.native
    
    def bxorVS(x: Vector, y: Scalar): Vector = js.native
    
    def bxorVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("bxor")
    def bxor_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("bxor")
    def bxor_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise binary xor x^y
    @JSName("bxor")
    def bxor_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def bxoreq(x: Vector, y: Scalar): Vector = js.native
    def bxoreq(x: Vector, y: Vector): Vector = js.native
    
    def bxoreqS(x: Vector, y: Scalar): Vector = js.native
    
    def bxoreqV(x: Vector, y: Vector): Vector = js.native
    
    // Coordinate matrices
    def cLU(matrix: Matrix): LU = js.native
    
    def cLUSolve(lu: LU, b: Vector): Vector = js.native
    
    def ccsDim(matrix: SparseMatrix): Vector = js.native
    
    def ccsDot(A: SparseMatrix, B: SparseMatrix): SparseMatrix = js.native
    
    def ccsFull(matrix: SparseMatrix): Matrix = js.native
    
    def ccsGather(matrix: SparseMatrix): SparseMatrix = js.native
    
    def ccsGetBlock(matrix: SparseMatrix): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Unit, j: Scalar): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Unit, j: Vector): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Scalar): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Scalar, j: Scalar): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Scalar, j: Vector): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Vector): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Vector, j: Scalar): SparseMatrix = js.native
    def ccsGetBlock(matrix: SparseMatrix, i: Vector, j: Vector): SparseMatrix = js.native
    
    def ccsLUP(matrix: SparseMatrix): LUPP = js.native
    def ccsLUP(matrix: SparseMatrix, threshold: Double): LUPP = js.native
    
    def ccsLUPSolve(lup: LUPP, B: SparseMatrix): Vector = js.native
    
    def ccsScatter(matrix: SparseMatrix): SparseMatrix = js.native
    
    // Compressed Column Storage matrices
    def ccsSparse(matrix: Matrix): SparseMatrix = js.native
    
    def ccsTSolve(matrix: SparseMatrix, b: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Unit, bj: Unit, xj: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Unit, bj: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Unit, bj: Vector, xj: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Vector, bj: Unit, xj: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Vector, bj: Vector): Vector = js.native
    def ccsTSolve(matrix: SparseMatrix, b: Vector, x: Vector, bj: Vector, xj: Vector): Vector = js.native
    
    def ccsadd(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsadd(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsadd(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsaddMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsand(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsand(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsand(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsandMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsband(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsband(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsband(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsbandMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsbor(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsbor(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsbor(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsborMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsbxor(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsbxor(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsbxor(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsbxorMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsdiv(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsdiv(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsdiv(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsdivMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccseq(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccseq(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccseq(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccseqMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsgeq(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccsgeq(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccsgeq(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsgeqMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsgt(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccsgt(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccsgt(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsgtMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsleq(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccsleq(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccsleq(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsleqMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccslshift(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccslshift(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccslshift(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccslshiftMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccslt(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccslt(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccslt(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsltMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsmod(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsmod(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsmod(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsmodMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsmul(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsmul(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsmul(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsmulMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsneq(x: Scalar, y: SparseMatrix): CCSComparisonResult = js.native
    def ccsneq(x: SparseMatrix, y: Scalar): CCSComparisonResult = js.native
    def ccsneq(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsneqMM(x: SparseMatrix, y: SparseMatrix): CCSComparisonResult = js.native
    
    def ccsor(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsor(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsor(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsorMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsrrshift(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsrrshift(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsrrshift(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsrrshiftMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsrshift(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccsrshift(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccsrshift(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccsrshiftMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccssub(x: Scalar, y: SparseMatrix): SparseMatrix = js.native
    def ccssub(x: SparseMatrix, y: Scalar): SparseMatrix = js.native
    def ccssub(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def ccssubMM(x: SparseMatrix, y: SparseMatrix): SparseMatrix = js.native
    
    def cdelsq(g: Matrix): Matrix = js.native
    
    def cdotmv(matrix: Matrix, x: Vector): Vector = js.native
    
    // Pointwise Math.ceil(x)
    def ceil(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def ceilV(x: Vector): Vector = js.native
    
    def ceileq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def ceileqV(x: Vector): Vector = js.native
    
    def cgrid(n: js.Tuple2[Double, Double]): Matrix = js.native
    def cgrid(n: js.Tuple2[Double, Double], shape: ShapeFunction): Matrix = js.native
    def cgrid(n: Double): Matrix = js.native
    def cgrid(n: Double, shape: ShapeFunction): Matrix = js.native
    @JSName("cgrid")
    def cgrid_L(n: js.Tuple2[Double, Double], shape: L): Matrix = js.native
    @JSName("cgrid")
    def cgrid_L(n: Double, shape: L): Matrix = js.native
    
    // Deep copy of Array
    def clone(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[
                                  (js.Array[(js.Array[js.Array[NonNullPrimitive] | NonNullPrimitive]) | NonNullPrimitive]) | NonNullPrimitive
                                ]) | NonNullPrimitive
                              ]) | NonNullPrimitive
                            ]) | NonNullPrimitive
                          ]
                        ]) | NonNullPrimitive
                      ]) | NonNullPrimitive
                    ]) | NonNullPrimitive
                  ]) | NonNullPrimitive
                ]) | NonNullPrimitive
              ]) | NonNullPrimitive
            ]) | NonNullPrimitive
          ]) | NonNullPrimitive
        ]
    ): js.Array[NonNullPrimitive] = js.native
    
    def cloneV(x: js.Array[NonNullPrimitive]): js.Array[NonNullPrimitive] = js.native
    
    def cloneeq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[
                                  (js.Array[(js.Array[js.Array[NonNullPrimitive] | NonNullPrimitive]) | NonNullPrimitive]) | NonNullPrimitive
                                ]) | NonNullPrimitive
                              ]) | NonNullPrimitive
                            ]) | NonNullPrimitive
                          ]
                        ]) | NonNullPrimitive
                      ]) | NonNullPrimitive
                    ]) | NonNullPrimitive
                  ]) | NonNullPrimitive
                ]) | NonNullPrimitive
              ]) | NonNullPrimitive
            ]) | NonNullPrimitive
          ]) | NonNullPrimitive
        ]
    ): js.Array[NonNullPrimitive] = js.native
    
    def cloneeqV(x: js.Array[NonNullPrimitive]): js.Array[NonNullPrimitive] = js.native
    
    // Pointwise Math.cos(x)
    def cos(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def cosV(x: Vector): Vector = js.native
    
    def coseq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def coseqV(x: Vector): Vector = js.native
    
    // Determinant
    def det(x: Matrix): Double = js.native
    
    // Create diagonal matrix
    def diag(diagonal: Vector): Matrix = js.native
    
    // linear algebra with arrays
    // Get Array dimensions
    def dim(arr: js.Any): Vector = js.native
    
    def div(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def div(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def div(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def div(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def divSV(x: Scalar, y: Vector): Vector = js.native
    
    def divVS(x: Vector, y: Scalar): Vector = js.native
    
    def divVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("div")
    def div_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("div")
    def div_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x/y
    @JSName("div")
    def div_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def diveq(x: Vector, y: Scalar): Vector = js.native
    def diveq(x: Vector, y: Vector): Vector = js.native
    
    def diveqS(x: Vector, y: Scalar): Vector = js.native
    
    def diveqV(x: Vector, y: Vector): Vector = js.native
    
    // Ode solver (Dormand-Prince)
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar]
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Double
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Double,
      maxit: Double
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Double,
      maxit: Double,
      event: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar]
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Double,
      maxit: Unit,
      event: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar]
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Unit,
      maxit: Double
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Unit,
      maxit: Double,
      event: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar]
    ): Dopri = js.native
    def dopri(
      x0: Scalar,
      x1: Scalar,
      y0: Scalar,
      f: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar],
      tol: Unit,
      maxit: Unit,
      event: js.Function2[/* x */ Vector | Scalar, /* y */ Vector | Scalar, Vector | Scalar]
    ): Dopri = js.native
    
    //     Matrix-Matrix, Matrix-Vector, Vector-Matrix and Vector-Vector product
    def dot(x: Matrix | Vector, y: Matrix | Vector): Vector | Matrix | Scalar = js.native
    def dot(x: Matrix | Vector, y: Scalar): Vector | Matrix | Scalar = js.native
    def dot(x: Scalar, y: Matrix | Vector): Vector | Matrix | Scalar = js.native
    def dot(x: Scalar, y: Scalar): Vector | Matrix | Scalar = js.native
    
    def dotMMbig(x: Matrix, y: Matrix): Matrix = js.native
    
    def dotMMsmall(x: Matrix, y: Matrix): Matrix = js.native
    
    def dotMV(x: Matrix, y: Vector): Vector = js.native
    
    def dotVM(x: Vector, y: Matrix): Vector = js.native
    
    def dotVV(x: Vector, y: Vector): Scalar = js.native
    
    // Linear programming
    def echelonize(matrix: Matrix): A = js.native
    
    def eig(A: Matrix): E = js.native
    def eig(A: Matrix, maxiter: Double): E = js.native
    
    val epsilon: Double = js.native
    
    def eq(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise comparison x === y
    def eq(x: Scalar, y: Scalar): Boolean = js.native
    def eq(x: Scalar, y: Vector): VectorBoolean = js.native
    def eq(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def eqSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def eqVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def eqVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("eq")
    def eq_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("eq")
    def eq_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def eqeq(x: Vector, y: Scalar): VectorBoolean = js.native
    def eqeq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def eqeqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def eqeqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    // Pointwise Math.exp(x)
    def exp(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def expV(x: Vector): Vector = js.native
    
    def expeq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def expeqV(x: Vector): Vector = js.native
    
    //     Poinwise Math.floor(x)
    def floor(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def floorV(x: Vector): Vector = js.native
    
    def flooreq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def flooreqV(x: Vector): Vector = js.native
    
    def geq(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise x>=y
    def geq(x: Scalar, y: Scalar): Boolean = js.native
    def geq(x: Scalar, y: Vector): VectorBoolean = js.native
    def geq(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def geqSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def geqVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def geqVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("geq")
    def geq_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("geq")
    def geq_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def geqeq(x: Vector, y: Scalar): VectorBoolean = js.native
    def geqeq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def geqeqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def geqeqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    // Extract a block from a matrix
    def getBlock(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      from: Vector,
      to: Vector
    ): js.Array[js.Array[Double]] = js.native
    
    // Get the diagonal of a Matrix
    def getDiag(matrix: Matrix): Vector = js.native
    
    def getURL(url: String): js.Any = js.native
    
    def gradient(f: js.Function1[/* x */ Vector, Scalar], x: Vector): Vector = js.native
    
    def gt(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise x>y
    def gt(x: Scalar, y: Scalar): Boolean = js.native
    def gt(x: Scalar, y: Vector): VectorBoolean = js.native
    def gt(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def gtSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def gtVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def gtVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("gt")
    def gt_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("gt")
    def gt_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def gteq(x: Vector, y: Scalar): VectorBoolean = js.native
    def gteq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def gteqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def gteqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    // Eigenvalues of real matrices
    def house(x: Vector): Vector = js.native
    
    // Identity matrix
    def identity(num: Double): Matrix = js.native
    
    // Encode a matrix as an image URL
    def imageURL(img: js.Array[js.Array[Double]]): String = js.native
    
    def inf(x: MultidimensionalMatrix | Vector): Double = js.native
    // Smallest value of entries (not modulus)
    def inf(x: Scalar): Double = js.native
    
    def infV(x: Vector): Double = js.native
    
    // Matrix inverse
    def inv(x: Matrix): Matrix = js.native
    
    def isFinite(x: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    
    def isFiniteV(x: Vector): VectorBoolean = js.native
    
    // Pointwise Number.isFinite(x)
    @JSName("isFinite")
    def isFinite_VectorBoolean(x: Vector): VectorBoolean = js.native
    
    def isFiniteeq(x: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    
    def isFiniteeqV(x: Vector): VectorBoolean = js.native
    
    @JSName("isFiniteeq")
    def isFiniteeq_VectorBoolean(x: Vector): VectorBoolean = js.native
    
    def isNaN(x: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    
    def isNaNV(x: Vector): VectorBoolean = js.native
    
    // Pointwise Number.isNan(x)
    @JSName("isNaN")
    def isNaN_VectorBoolean(x: Vector): VectorBoolean = js.native
    
    def isNaNeq(x: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    
    def isNaNeqV(x: Vector): VectorBoolean = js.native
    
    @JSName("isNaNeq")
    def isNaNeq_VectorBoolean(x: Vector): VectorBoolean = js.native
    
    var largeArray: Double = js.native
    
    def leq(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise x<=y
    def leq(x: Scalar, y: Scalar): Boolean = js.native
    def leq(x: Scalar, y: Vector): VectorBoolean = js.native
    def leq(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def leqSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def leqVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def leqVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("leq")
    def leq_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("leq")
    def leq_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def leqeq(x: Vector, y: Scalar): VectorBoolean = js.native
    def leqeq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def leqeqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def leqeqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    // Generate evenly spaced values
    def linspace(from: Double, to: Double): Vector = js.native
    def linspace(from: Double, to: Double, numberOfValues: Double): Vector = js.native
    
    // Pointwise Math.log(x)
    def log(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def logV(x: Vector): Vector = js.native
    
    def logeq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def logeqV(x: Vector): Vector = js.native
    
    def lshift(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def lshift(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def lshift(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def lshift(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def lshiftSV(x: Scalar, y: Vector): Vector = js.native
    
    def lshiftVS(x: Vector, y: Scalar): Vector = js.native
    
    def lshiftVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("lshift")
    def lshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("lshift")
    def lshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x<<y
    @JSName("lshift")
    def lshift_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def lshifteq(x: Vector, y: Scalar): Vector = js.native
    def lshifteq(x: Vector, y: Vector): Vector = js.native
    
    def lshifteqS(x: Vector, y: Scalar): Vector = js.native
    
    def lshifteqV(x: Vector, y: Vector): Vector = js.native
    
    def lt(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise x<y
    def lt(x: Scalar, y: Scalar): Boolean = js.native
    def lt(x: Scalar, y: Vector): VectorBoolean = js.native
    def lt(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def ltSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def ltVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def ltVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("lt")
    def lt_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("lt")
    def lt_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def lteq(x: Vector, y: Scalar): VectorBoolean = js.native
    def lteq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def lteqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def lteqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    def max(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def max(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def max(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def max(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def maxSV(x: Scalar, y: Vector): Vector = js.native
    
    def maxVS(x: Vector, y: Scalar): Vector = js.native
    
    def maxVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("max")
    def max_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("max")
    def max_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise max(x,y)
    @JSName("max")
    def max_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def maxeq(x: Vector, y: Scalar): Vector = js.native
    def maxeq(x: Vector, y: Vector): Vector = js.native
    
    def maxeqS(x: Vector, y: Scalar): Vector = js.native
    
    def maxeqV(x: Vector, y: Vector): Vector = js.native
    
    def min(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def min(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def min(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def min(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def minSV(x: Scalar, y: Vector): Vector = js.native
    
    def minVS(x: Vector, y: Scalar): Vector = js.native
    
    def minVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("min")
    def min_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("min")
    def min_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise min(x,y)
    @JSName("min")
    def min_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def mineq(x: Vector, y: Scalar): Vector = js.native
    def mineq(x: Vector, y: Vector): Vector = js.native
    
    def mineqS(x: Vector, y: Scalar): Vector = js.native
    
    def mineqV(x: Vector, y: Vector): Vector = js.native
    
    def mod(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def mod(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def mod(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def mod(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def modSV(x: Scalar, y: Vector): Vector = js.native
    
    def modVS(x: Vector, y: Scalar): Vector = js.native
    
    def modVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("mod")
    def mod_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("mod")
    def mod_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x%y
    @JSName("mod")
    def mod_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def modeq(x: Vector, y: Scalar): Vector = js.native
    def modeq(x: Vector, y: Vector): Vector = js.native
    
    def modeqS(x: Vector, y: Scalar): Vector = js.native
    
    def modeqV(x: Vector, y: Vector): Vector = js.native
    
    def mul(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def mul(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def mul(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def mul(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def mulSV(x: Scalar, y: Vector): Vector = js.native
    
    def mulVS(x: Vector, y: Scalar): Vector = js.native
    
    def mulVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("mul")
    def mul_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("mul")
    def mul_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x*y
    @JSName("mul")
    def mul_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def muleq(x: Vector, y: Scalar): Vector = js.native
    def muleq(x: Vector, y: Vector): Vector = js.native
    
    def muleqS(x: Vector, y: Scalar): Vector = js.native
    
    def muleqV(x: Vector, y: Vector): Vector = js.native
    
    def neg(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    // Pointwise -x
    def neg(x: Double): Double = js.native
    
    def negV(x: Vector): Vector = js.native
    
    def negeq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    def negeq(x: Double): Double = js.native
    
    def negeqV(x: Vector): Vector = js.native
    
    // Negate matrix and transpose
    def negtranspose(x: Matrix): Matrix = js.native
    
    def neq(x: MultidimensionalMatrix, y: MultidimensionalMatrix): MultidimensionalArray[Boolean] = js.native
    // Pointwise x!==y
    def neq(x: Scalar, y: Scalar): Boolean = js.native
    def neq(x: Scalar, y: Vector): VectorBoolean = js.native
    def neq(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def neqSV(x: Scalar, y: Vector): VectorBoolean = js.native
    
    def neqVS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def neqVV(x: Vector, y: Vector): VectorBoolean = js.native
    
    @JSName("neq")
    def neq_VectorBoolean(x: Scalar, y: Scalar): VectorBoolean = js.native
    @JSName("neq")
    def neq_VectorBoolean(x: Vector, y: Vector): VectorBoolean = js.native
    
    def neqeq(x: Vector, y: Scalar): VectorBoolean = js.native
    def neqeq(x: Vector, y: Vector): VectorBoolean = js.native
    
    def neqeqS(x: Vector, y: Scalar): VectorBoolean = js.native
    
    def neqeqV(x: Vector, y: Vector): VectorBoolean = js.native
    
    def norm1(x: MultidimensionalMatrix | Vector): Double = js.native
    // Sum all absolute values of entries
    def norm1(x: Scalar): Double = js.native
    
    def norm1V(x: Vector): Double = js.native
    
    def norm2(x: MultidimensionalMatrix | Vector): Double = js.native
    // Square root of the sum of the square of the entries of x
    def norm2(x: Scalar): Double = js.native
    
    def norm2Squared(x: MultidimensionalMatrix | Vector): Double = js.native
    // Sum of squares of entries of x
    def norm2Squared(x: Scalar): Double = js.native
    
    def norm2SquaredV(x: Vector): Double = js.native
    
    def norminf(x: MultidimensionalMatrix | Vector): Double = js.native
    // Largest modulus entry of x
    def norminf(x: Scalar): Double = js.native
    
    def norminfV(x: Vector): Double = js.native
    
    def not(x: MultidimensionalArray[NonNullPrimitive]): MultidimensionalArray[Boolean] = js.native
    // Pointwise logical negation !x
    def not(x: NonNullPrimitive): Boolean = js.native
    
    def notV(x: js.Array[NonNullPrimitive]): VectorBoolean = js.native
    
    @JSName("not")
    def not_VectorBoolean(x: js.Array[NonNullPrimitive]): VectorBoolean = js.native
    
    def noteq(x: MultidimensionalArray[NonNullPrimitive]): MultidimensionalArray[Boolean] = js.native
    def noteq(x: NonNullPrimitive): Boolean = js.native
    
    def noteqV(x: js.Array[NonNullPrimitive]): VectorBoolean = js.native
    
    @JSName("noteq")
    def noteq_VectorBoolean(x: js.Array[NonNullPrimitive]): VectorBoolean = js.native
    
    def or(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def or(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def or(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def or(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def orSV(x: Scalar, y: Vector): Vector = js.native
    
    def orVS(x: Vector, y: Scalar): Vector = js.native
    
    def orVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("or")
    def or_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("or")
    def or_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    //     Pointwise logical or x||y
    @JSName("or")
    def or_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def oreq(x: Vector, y: Scalar): Vector = js.native
    def oreq(x: Vector, y: Vector): Vector = js.native
    
    def oreqS(x: Vector, y: Scalar): Vector = js.native
    
    def oreqV(x: Vector, y: Vector): Vector = js.native
    
    def parseCSV(csv: String): js.Array[js.Array[String]] = js.native
    
    def parseDate(date: String): Double = js.native
    def parseDate(dates: js.Array[String]): js.Array[Double] = js.native
    
    def parseFloat(input: String): Double = js.native
    def parseFloat(inputs: js.Array[String]): js.Array[Double] = js.native
    
    def pow(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def pow(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def pow(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def pow(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def powSV(x: Scalar, y: Vector): Vector = js.native
    
    def powVS(x: Vector, y: Scalar): Vector = js.native
    
    def powVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("pow")
    def pow_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("pow")
    def pow_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x**y
    @JSName("pow")
    def pow_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def poweq(x: Vector, y: Scalar): Vector = js.native
    def poweq(x: Vector, y: Vector): Vector = js.native
    
    def poweqS(x: Vector, y: Scalar): Vector = js.native
    
    def poweqV(x: Vector, y: Vector): Vector = js.native
    
    var precision: Double = js.native
    
    def prettyPrint(): String = js.native
    def prettyPrint(x: js.Any): String = js.native
    
    def prod(x: MultidimensionalMatrix | Vector): Double = js.native
    // Product of all the entries of x
    def prod(x: Scalar): Double = js.native
    
    def prodV(x: Vector): Double = js.native
    
    // Create an Array of random numbers
    def random(s: Vector): Vector | MultidimensionalMatrix = js.native
    
    //     Create an Array by duplicating values
    def rep[T](scale: Vector, value: T): MultidimensionalArray[T] = js.native
    def rep[T](scale: Vector, value: T, key: Double): MultidimensionalArray[T] = js.native
    
    //     Pointwise Math.round(x)
    def round(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def roundV(x: Vector): Vector = js.native
    
    def roundeq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def roundeqV(x: Vector): Vector = js.native
    
    def rrshift(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def rrshift(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def rrshift(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def rrshift(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def rrshiftSV(x: Scalar, y: Vector): Vector = js.native
    
    def rrshiftVS(x: Vector, y: Scalar): Vector = js.native
    
    def rrshiftVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("rrshift")
    def rrshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("rrshift")
    def rrshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x>>>y
    @JSName("rrshift")
    def rrshift_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def rrshifteq(x: Vector, y: Scalar): Vector = js.native
    def rrshifteq(x: Vector, y: Vector): Vector = js.native
    
    def rrshifteqS(x: Vector, y: Scalar): Vector = js.native
    
    def rrshifteqV(x: Vector, y: Vector): Vector = js.native
    
    def rshift(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def rshift(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def rshift(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def rshift(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def rshiftSV(x: Scalar, y: Vector): Vector = js.native
    
    def rshiftVS(x: Vector, y: Scalar): Vector = js.native
    
    def rshiftVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("rshift")
    def rshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("rshift")
    def rshift_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x>>y
    @JSName("rshift")
    def rshift_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def rshifteq(x: Vector, y: Scalar): Vector = js.native
    def rshifteq(x: Vector, y: Vector): Vector = js.native
    
    def rshifteqS(x: Vector, y: Scalar): Vector = js.native
    
    def rshifteqV(x: Vector, y: Vector): Vector = js.native
    
    //     x and y are entrywise identical
    def same(x: js.Any, y: js.Any): Boolean = js.native
    
    /** @deprecated */
    def sclone[T](matrix: T): T = js.native
    def sclone[T](matrix: T, k: Double): T = js.native
    def sclone[T](matrix: T, k: Double, n: Double): T = js.native
    def sclone[T](matrix: T, k: Unit, n: Double): T = js.native
    
    /** @deprecated */
    def sdiag(d: Vector): DeprecatedSparseMatrix = js.native
    
    /**  @deprecated */
    def sdim(matrix: js.Any): Vector = js.native
    def sdim(matrix: js.Any, ret: Unit, k: Double): Vector = js.native
    def sdim(matrix: js.Any, ret: Vector): Vector = js.native
    def sdim(matrix: js.Any, ret: Vector, k: Double): Vector = js.native
    
    def sdot(
      x: DeprecatedSparseMatrix | DeprecatedSparseVector,
      y: DeprecatedSparseMatrix | DeprecatedSparseVector
    ): Scalar | DeprecatedSparseVector | DeprecatedSparseMatrix = js.native
    def sdot(x: DeprecatedSparseMatrix | DeprecatedSparseVector, y: Scalar): Scalar | DeprecatedSparseVector | DeprecatedSparseMatrix = js.native
    def sdot(x: Scalar, y: DeprecatedSparseMatrix | DeprecatedSparseVector): Scalar | DeprecatedSparseVector | DeprecatedSparseMatrix = js.native
    /** @deprecated */
    def sdot(x: Scalar, y: Scalar): Scalar | DeprecatedSparseVector | DeprecatedSparseMatrix = js.native
    
    /** @deprecated */
    def sdotMM(a: DeprecatedSparseMatrix, b: DeprecatedSparseMatrix): DeprecatedSparseMatrix = js.native
    
    /** @deprecated */
    def sdotMV(matrix: DeprecatedSparseMatrix, vector: DeprecatedSparseVector): DeprecatedSparseVector = js.native
    
    /** @deprecated */
    def sdotVM(vector: DeprecatedSparseVector, matrix: DeprecatedSparseMatrix): DeprecatedSparseMatrix = js.native
    
    /** @deprecated */
    def sdotVV(x: DeprecatedSparseVector, y: DeprecatedSparseVector): Double = js.native
    
    var seedrandom: Random = js.native
    
    // Set a block of a matrix
    def setBlock(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      from: Vector,
      to: Vector,
      b: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]
    ): js.Array[js.Array[Double]] = js.native
    
    /** @deprecated */
    def sgather(matrix: DeprecatedSparseMatrix): DeprecatedSparseMatrix = js.native
    def sgather(matrix: DeprecatedSparseMatrix, ret: Unit, k: DeprecatedSparseVector): DeprecatedSparseMatrix = js.native
    def sgather(matrix: DeprecatedSparseMatrix, ret: DeprecatedSparseVector): DeprecatedSparseMatrix = js.native
    def sgather(matrix: DeprecatedSparseMatrix, ret: DeprecatedSparseVector, k: DeprecatedSparseVector): DeprecatedSparseMatrix = js.native
    
    /** @deprecated */
    def sidentity(n: Scalar): DeprecatedSparseMatrix = js.native
    
    // Pointwise Math.sin(x)
    def sin(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def sinV(x: Vector): Vector = js.native
    
    def sineq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def sineqV(x: Vector): Vector = js.native
    
    // Solving the linear problem Ax=b
    def solve(matrix: Matrix, vector: Vector): Vector = js.native
    
    def solveLP(c: Vector, A: Matrix, b: Vector): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Unit, tol: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Unit, tol: Double, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Unit, tol: Unit, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Matrix): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Matrix, tol: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Matrix, tol: Double, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Unit, beq: Matrix, tol: Unit, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Unit, tol: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Unit, tol: Double, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Unit, tol: Unit, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Matrix): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Matrix, tol: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Matrix, tol: Double, maxit: Double): Iterations = js.native
    def solveLP(c: Vector, A: Matrix, b: Vector, Aeq: Matrix, beq: Matrix, tol: Unit, maxit: Double): Iterations = js.native
    
    def solveQP(Dmat: Matrix, dvec: Vector, Amat: Matrix, bvec: Vector): Iact = js.native
    def solveQP(Dmat: Matrix, dvec: Vector, Amat: Matrix, bvec: Vector, meq: Double): Iact = js.native
    def solveQP(Dmat: Matrix, dvec: Vector, Amat: Matrix, bvec: Vector, meq: Double, factorized: js.Any): Iact = js.native
    def solveQP(Dmat: Matrix, dvec: Vector, Amat: Matrix, bvec: Vector, meq: Unit, factorized: js.Any): Iact = js.native
    
    // Splines
    def spline(x: Vector, y: Matrix | Vector): Spline = js.native
    def spline(x: Vector, y: Matrix | Vector, k1: Unit, kn: Scalar): Spline = js.native
    def spline(x: Vector, y: Matrix | Vector, k1: Scalar): Spline = js.native
    def spline(x: Vector, y: Matrix | Vector, k1: Scalar, kn: Scalar): Spline = js.native
    @JSName("spline")
    def spline_periodic(x: Vector, y: Matrix | Vector, k1: Unit, kn: periodic): Spline = js.native
    @JSName("spline")
    def spline_periodic(x: Vector, y: Matrix | Vector, k1: Scalar, kn: periodic): Spline = js.native
    @JSName("spline")
    def spline_periodic(x: Vector, y: Matrix | Vector, k1: periodic): Spline = js.native
    @JSName("spline")
    def spline_periodic(x: Vector, y: Matrix | Vector, k1: periodic, kn: Scalar): Spline = js.native
    @JSName("spline")
    def spline_periodic(x: Vector, y: Matrix | Vector, k1: periodic, kn: periodic): Spline = js.native
    
    // Pointwise Math.sqrt(x)
    def sqrt(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def sqrtV(x: Vector): Vector = js.native
    
    def sqrteq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def sqrteqV(x: Vector): Vector = js.native
    
    /** @deprecated */
    def sscatter(matrix: DeprecatedSparseMatrix): DeprecatedSparseMatrix = js.native
    
    /** @deprecated */
    def stranspose(matrix: DeprecatedSparseMatrix): DeprecatedSparseMatrix = js.native
    
    def sub(x: Scalar, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def sub(x: Scalar, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    def sub(x: Vector, y: Scalar, args: (Scalar | Vector)*): Vector = js.native
    def sub(x: Vector, y: Vector, args: (Scalar | Vector)*): Vector = js.native
    
    def subSV(x: Scalar, y: Vector): Vector = js.native
    
    def subVS(x: Vector, y: Scalar): Vector = js.native
    
    def subVV(x: Vector, y: Vector): Vector = js.native
    
    @JSName("sub")
    def sub_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    @JSName("sub")
    def sub_Array(
      x: js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ],
      y: Scalar,
      args: ((js.Array[
          js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]
        ]) | Scalar)*
    ): js.Array[js.Array[Double]] = js.native
    // Pointwise x-y
    @JSName("sub")
    def sub_Scalar(x: Scalar, y: Scalar, args: Scalar*): Scalar = js.native
    
    def subeq(x: Vector, y: Scalar): Vector = js.native
    def subeq(x: Vector, y: Vector): Vector = js.native
    
    def subeqS(x: Vector, y: Scalar): Vector = js.native
    
    def subeqV(x: Vector, y: Vector): Vector = js.native
    
    def sum(x: MultidimensionalMatrix | Vector): Double = js.native
    //     Sum all the entries of x
    def sum(x: Scalar): Double = js.native
    
    def sumV(x: Vector): Double = js.native
    
    def sup(x: MultidimensionalMatrix | Vector): Double = js.native
    // Largest value of entries (not modulus)
    def sup(x: Scalar): Double = js.native
    
    def supV(x: Vector): Double = js.native
    
    def svd(matrix: Matrix): S = js.native
    
    // return instance of Tensor class. X — real value, y — imaginary part.
    def t(x: TensorValue): Tensor = js.native
    def t(x: TensorValue, y: TensorValue): Tensor = js.native
    
    // Pointwise tangent
    def tan(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def tanV(x: Vector): Vector = js.native
    
    def taneq(
      x: js.Array[
          (js.Array[
            (js.Array[
              (js.Array[
                (js.Array[
                  (js.Array[
                    (js.Array[
                      (js.Array[
                        (js.Array[
                          js.Array[
                            (js.Array[
                              (js.Array[
                                (js.Array[(js.Array[(js.Array[js.Array[Double] | Double]) | Double]) | Double]) | Double
                              ]) | Double
                            ]) | Double
                          ]
                        ]) | Double
                      ]) | Double
                    ]) | Double
                  ]) | Double
                ]) | Double
              ]) | Double
            ]) | Double
          ]) | Double
        ]
    ): js.Array[Double] = js.native
    
    def taneqV(x: Vector): Vector = js.native
    
    // x * y
    def tensor(x: Scalar, y: Scalar): Scalar = js.native
    //     TensorValue product ret[i][j] = x[i]*y[j]
    def tensor(x: Vector, y: Vector): Matrix = js.native
    
    // toCSV is buggy.
    // https://github.com/sloisel/numeric/pull/51
    def toCSV(csvArray: js.Array[js.Array[js.Any]]): String = js.native
    
    def toUpperHessenberg(matrix: Matrix): H = js.native
    
    // Matrix transpose
    def transpose(x: Matrix): Matrix = js.native
    
    def trunc(x: Double, y: Double): Vector = js.native
    def trunc(x: Double, y: Vector): Vector = js.native
    def trunc(x: Vector, y: Double): Vector = js.native
    def trunc(x: Vector, y: Vector): Vector = js.native
    
    def truncSV(x: Double, y: Vector): Vector = js.native
    
    def truncVS(x: Vector, y: Double): Vector = js.native
    
    // Round the values of entries
    def truncVV(x: Vector, y: Vector): Vector = js.native
    
    // Unconstrained optimisations
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Double): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Double, gradient: js.Any): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Double, gradient: js.Any, maxit: Double): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Double,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: js.Any,
      maxit: Unit,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Double, gradient: Unit, maxit: Double): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Double,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Double,
      gradient: Unit,
      maxit: Unit,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Unit, gradient: js.Any): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Unit, gradient: js.Any, maxit: Double): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Double,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: js.Any,
      maxit: Unit,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(f: js.Function1[/* x */ Vector, Scalar], x0: Vector, tol: Unit, gradient: Unit, maxit: Double): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Double,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Double,
      callback: Unit,
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ]
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Unit,
      callback: js.Function5[
          /* it */ Double, 
          /* x0 */ Vector, 
          /* f0 */ Scalar, 
          /* g0 */ Vector, 
          /* h1 */ Matrix, 
          js.Any
        ],
      options: Hinv
    ): F = js.native
    def uncmin(
      f: js.Function1[/* x */ Vector, Scalar],
      x0: Vector,
      tol: Unit,
      gradient: Unit,
      maxit: Unit,
      callback: Unit,
      options: Hinv
    ): F = js.native
    
    val version: String = js.native
  }
  
  type Scalar = Double
  
  type ShapeFunction = js.Function2[/* i */ Double, /* j */ Double, Boolean]
  
  type SparseMatrix = js.Tuple3[Vector, Vector, Vector]
  
  @js.native
  trait Spline extends StObject {
    
    def at(x0: Scalar): Vector | Scalar = js.native
    def at(x0: Vector): Vector | Scalar = js.native
    
    def diff(): Spline = js.native
    
    var kl: Vector = js.native
    
    var kr: Vector = js.native
    
    def roots(): Vector = js.native
    
    var x: Vector = js.native
    
    var yl: Vector = js.native
    
    var yr: Vector = js.native
  }
  
  @js.native
  trait Tensor extends StObject {
    
    def abs(): Tensor = js.native
    
    def add(tensor: Tensor): Tensor = js.native
    def add(tensor: TensorValue): Tensor = js.native
    
    def conj(): Tensor = js.native
    
    def cos(): Tensor = js.native
    
    def diag(d: Tensor): Tensor = js.native
    def diag(d: TensorValue): Tensor = js.native
    
    def div(tensor: Tensor): Tensor = js.native
    def div(tensor: TensorValue): Tensor = js.native
    
    def dot(tensor: Tensor): Tensor = js.native
    def dot(tensor: TensorValue): Tensor = js.native
    
    def eig(): E = js.native
    
    def exp(): Tensor = js.native
    
    // fast fourier transforms
    def fft(): Tensor = js.native
    
    def get(i: Vector): Tensor = js.native
    
    def getBlock(from: Vector, to: Vector): Tensor = js.native
    
    def getDiag(): Tensor = js.native
    
    def getRow(k: Double): Tensor = js.native
    
    def getRows(i0: Double, i1: Double): Tensor = js.native
    
    def identity(n: Double): Tensor = js.native
    
    def ifft(): Tensor = js.native
    
    def inv(): Tensor = js.native
    
    def log(): Tensor = js.native
    
    def mul(tensor: Tensor): Tensor = js.native
    def mul(tensor: TensorValue): Tensor = js.native
    
    def neg(): Tensor = js.native
    
    def norm2(): Tensor = js.native
    
    // it's buggy. https://github.com/sloisel/numeric/pull/59
    def reciprocal(): Tensor = js.native
    
    def rep(s: Vector, value: Tensor): Tensor = js.native
    def rep(s: Vector, value: TensorValue): Tensor = js.native
    
    def set(i: Vector, value: Tensor): Tensor = js.native
    
    def setBlock(from: Vector, to: Vector, tensor: Tensor): Tensor = js.native
    
    def setRow(i: Double, tensor: Tensor): Tensor = js.native
    
    def setRows(i0: Double, i1: Double, tensor: Tensor): Tensor = js.native
    
    def sin(): Tensor = js.native
    
    def sub(tensor: Tensor): Tensor = js.native
    def sub(tensor: TensorValue): Tensor = js.native
    
    def transjugate(): Tensor = js.native
    
    def transpose(): Tensor = js.native
    
    var x: TensorValue = js.native
    
    var y: js.UndefOr[TensorValue] = js.native
  }
  
  type TensorValue = Scalar | Vector | MultidimensionalMatrix
  
  type Vector = js.Array[Double]
  
  type VectorBoolean = js.Array[Boolean]
  
  type _To = Numeric
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Numeric = ^
}
