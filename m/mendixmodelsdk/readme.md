```
/**
 * Module containing several often-used interfaces.
 */
/*
The MIT License (MIT)

Copyright (c) 2015 - present Mendix BV

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in
all copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
THE SOFTWARE.
*/

/** Current SDK version: 4.18.0 */
/**
 * Convenience to be able to export everything at once.
 */
/** Highest supported Metamodel version: 7.22.0 */
/**
 * The `utils` module contains various utility interfaces and functions.
 */
/**
 * "Something" that contains properties.
 * Concrete sub types: MxElement, MxStructuralUnit, MxModelUnit.
 * Abstract sub types: MxAbstractElement, MxAbstractUnit.
 *
 * Each unit in the model is guaranteed to exist only once in memory.
 */
/**
 * Types defined in this file express JSON serialization and are shared with the Model API Server.
 * Some types (points) are used verbatim through the rest of the SDK.
 */
/**
 * The contents of the `MetaData` table (which always contains one row) in the MPR contained in the working copy's MPK.
 * This is useful to determine product version and to be able to re-export the MPR as part of an MPK
 * that can be read in by the Business Modeler.
 */
```